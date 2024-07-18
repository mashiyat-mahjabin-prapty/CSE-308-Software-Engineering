public abstract class account extends person{
    protected String accType;
    protected double depAmount;
    protected double loanAmount;
    protected static double interest;
    protected int yearCnt;
    protected double maxLoan;
    protected boolean loanApproved;
    protected boolean hasLoan;
    protected double svcCharge;

    public account(String name, String accType) {
        super(name);
        this.accType = accType;
        yearCnt = 0;
    }

    public double getSvcCharge() {
        return svcCharge;
    }

    public void setSvcCharge(double svcCharge) {
        this.svcCharge = svcCharge;
    }

    public void setYearCnt(int yearCnt) {
        this.yearCnt = yearCnt;
    }

    public double getMaxLoan() {
        return maxLoan;
    }

    public void setMaxLoan(double maxLoan) {
        this.maxLoan = maxLoan;
    }

    public boolean isLoanApproved() {
        return loanApproved;
    }

    public void setLoanApproved(boolean loanApproved) {
        this.loanApproved = loanApproved;
    }

    public boolean isHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(boolean hasLoan) {
        this.hasLoan = hasLoan;
    }

    public abstract boolean createAccount(double amount);

    public int getYearCnt() {
        return yearCnt;
    }

    public void setYearCnt() {
        this.yearCnt++;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getDepAmount() {
        return depAmount;
    }

    public void setDepAmount(double depAmount) {
        this.depAmount = depAmount;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterest()
    {
        return interest;
    }

    public static void setInterest(double Interest) {
        interest = Interest;
    }

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);

    public boolean reqLoan(double amount)

    {
        if(hasLoan)
        {
            System.out.println("You already have a loan");
            return false;
        }
        if(amount > maxLoan) {
            System.out.println("You are requesting more loan than your subscribed package");
            return false;
        }
        loanAmount = amount;
        //depAmount += amount;
        return true;
    }

    public boolean request(double amount)
    {
        if (hasLoan && loanApproved)
        {
            depAmount += amount;
            loanAmount = amount;
        }
        return true;
    }

    public abstract boolean increment();
}
