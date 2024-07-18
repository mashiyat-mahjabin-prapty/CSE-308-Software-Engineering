public class savings extends account {

    public savings(String name, String accType) {
        super(name, accType);
        interest = 0.1;
        maxLoan = 10000.0;
        svcCharge = 500;
    }

    @Override
    public boolean createAccount(double amount) {
        depAmount = amount;
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        if(hasLoan)
        {
            if(loanAmount > 0.0)
            {
                if(loanAmount > amount)
                {
                    loanAmount -= amount;
                    amount = 0.0;
                }
                else
                {
                    loanAmount = 0.0;
                    hasLoan = false;
                    amount -= loanAmount;
                }
            }
        }
        depAmount += amount;
        System.out.println(amount + " deposited in the account");
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount > depAmount)
        {
            System.out.println("Invalid Transaction!!!");
            System.out.println("Your current balance " + depAmount);
            if(loanAmount > 0.0)
            {
                System.out.println("Your loan " + loanAmount);
            }
            return false;
        }
        if(depAmount-amount <= 1000.0)
        {
            System.out.println("Invalid Transaction!!");
            return false;
        }
        depAmount -= amount;
        System.out.println(amount + " has been withdrawn from the account");
        return true;
    }

    @Override
    public boolean reqLoan(double amount) {
        return super.reqLoan(amount);
    }

    @Override
    public boolean increment() {
        depAmount += depAmount*interest;
        depAmount -= svcCharge;
        return true;
    }
}
