public class cashier extends employee{

    public cashier(String name, String empType) {
        super(name, empType);
        seeFund = false;
        changeInterest = false;
        approveLoan = false;
    }
}
