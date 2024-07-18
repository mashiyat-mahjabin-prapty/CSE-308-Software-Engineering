public class managing_director extends employee{
    public managing_director(String name, String empType) {
        super(name, empType);
        seeFund = true;
        changeInterest = true;
        approveLoan = true;
    }

}
