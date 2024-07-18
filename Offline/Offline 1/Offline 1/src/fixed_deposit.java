public class fixed_deposit extends account {

    public fixed_deposit(String name, String accType) {
        super(name, accType);
        interest = 0.15;
        maxLoan = 100000.0;
        svcCharge = 500;
    }

    @Override
    public boolean createAccount(double amount) {
        if(amount < 100000.0)
        {
            System.out.println("You need to deposit at least 100000$");
            return false;
        }
        depAmount = amount;
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        if(amount < 50000.0) {
            System.out.println("You must deposit more than 50000 dollars");
            return false;
        }
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
        return true;
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
        if(yearCnt == 0)
        {
            System.out.println("Account not matured yet!!");
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
