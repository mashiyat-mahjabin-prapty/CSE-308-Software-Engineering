public class officer extends employee{
    public officer(String name, String empType) {
        super(name, empType);
        seeFund = false;
        changeInterest = false;
        approveLoan = true;
    }
    public boolean approveLoan()
    {
        return true;
    }

}
