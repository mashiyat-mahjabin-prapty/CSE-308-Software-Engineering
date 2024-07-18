public class loan extends account{

    public loan(String name, String accType) {
        super(name, accType);
        interest = 0.1;
        svcCharge = 500;
    }

    @Override
    public boolean createAccount(double amount) {
        loanAmount = amount;
        maxLoan = amount + amount*0.05;
        return true;
    }

    @Override
    public boolean deposit(double amount) {
        if(loanAmount-amount >= 0)
        loanAmount -= amount;
        if(loanAmount == 0.0)
        {
            hasLoan = false;
        }
        System.out.println(amount + " of the loan has been deposited");
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Invalid instruction");
        return false;
    }

    @Override
    public boolean reqLoan(double amount) {
        return super.reqLoan(amount);
    }

    @Override
    public boolean increment() {
        loanAmount += loanAmount*interest;
        loanAmount += svcCharge;
        return true;
    }
}
