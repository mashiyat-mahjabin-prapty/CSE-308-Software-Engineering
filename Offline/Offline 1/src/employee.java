public abstract class employee extends person{
    protected String empType;
    protected boolean approveLoan;
    protected boolean changeInterest;
    protected boolean seeFund;

    public employee(String name, String empType) {
        super(name);
        this.empType = empType;
    }

    public boolean isSeeFund() {
        return seeFund;
    }

    public void setSeeFund(boolean seeFund) {
        this.seeFund = seeFund;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public boolean isApproveLoan() {
        return approveLoan;
    }

    public void setApproveLoan(boolean approveLoan) {
        this.approveLoan = approveLoan;
    }

    public boolean isChangeInterest() {
        return changeInterest;
    }

    public void setChangeInterest(boolean changeInterest) {
        this.changeInterest = changeInterest;
    }

    public String lookup(String name)
    {
        return name;
    }
}
