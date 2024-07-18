import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bank {
    private List<employee> emp = new ArrayList<>();
    private double fund;
    private List<account> ll = new ArrayList<account>();
    private List<account> loans = new ArrayList<>();

    public bank() {
        for(int i = 0; i < 8; i++)
        {
            if(i == 0)
            {
                managing_director md = new managing_director("MD", "MD");
                emp.add(i, md);
            }
            else if(i == 1 || i == 2)
            {
                String s = Integer.toString(i);
                officer o = new officer("O"+s, "Officer");
                emp.add(i, o);
            }
            else
            {
                String s = Integer.toString(i-2);
                cashier c = new cashier("C"+s, "Cashier");
                emp.add(i, c);
            }
        }
        System.out.println("Bank created with employees ");
        for(int i = 0; i < emp.size(); i++)
        {
            employee e = emp.get(i);
            if(i == emp.size()-1) System.out.println(e.getName());
            else System.out.print(e.getName() + ", ");
        }
        fund = 1000000.0;
    }

    public void create()
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Name: " + name);
        for (int i = 0; i < ll.size(); i++) {
            account acc = ll.get(i);
            if (acc.getName().equalsIgnoreCase(name)) {
                System.out.println("Invalid name, account exists already");
                return;
            }
        }
            String type = scanner.next();
            String amount = scanner.next();
            System.out.println("type: " + type + " amount: " + amount);
            if (Double.parseDouble(amount) < 1000.0) {
                System.out.println("You must deposit more than 1000");
                return;
            }
            if (type.equalsIgnoreCase("student")) {
                account a = new student(name, type);
                if(a.createAccount(Double.parseDouble(amount)))
                {
                    System.out.println("Student account for " + name + " created; initial balance " + amount);
                    fund += Double.parseDouble(amount);
                    ll.add(a);
                };
            } else if (type.equalsIgnoreCase("savings")) {
                account a = new savings(name, type);
                if(a.createAccount(Double.parseDouble(amount)))
                {
                    System.out.println("Savings account for " + name + " created; initial balance " + amount);
                    fund += Double.parseDouble(amount);
                    ll.add(a);
                };
            } else if (type.equalsIgnoreCase("loan")) {
                account a = new loan(name, type);
                if(a.createAccount(Double.parseDouble(amount)))
                {
                    System.out.println("Loan account for " + name + " created; amount of loan " + amount);
                    fund -= Double.parseDouble(amount);
                    ll.add(a);
                };
            } else if (type.equalsIgnoreCase("fixed_deposit")) {
                account a = new fixed_deposit(name, type);
                if(a.createAccount(Double.parseDouble(amount)))
                {
                    System.out.println("Fixed_deposit account for " + name + " created; initial balance " + amount);
                    fund += Double.parseDouble(amount);
                    ll.add(a);
                }

            } else {
                System.out.println("Invalid account type");
                return;
            }

    }

    public void lookup()
    {
        Scanner br = new Scanner(System.in);
        String name = br.next();
        for(int j = 0; j < ll.size(); j++)
        {
            account a = ll.get(j);
            if(name.equalsIgnoreCase(a.getName()))
            {
                System.out.println(name + " has current balance of " + a.getDepAmount());
            }
        }
    }

    public void see(employee e)
    {
        if(e.isSeeFund())
        {
            System.out.println("Current fund of bank: " + fund);
        }
        else
        {
            System.out.println("You don't have permission for this operation");
        }
    }

    public void approve(employee e)
    {
        if(e.isApproveLoan())
        {
            for(int j = 0; j < loans.size(); j++)
            {
                account a = loans.get(j);
                System.out.println(a.getName() + " has a loan request of " + a.getLoanAmount());
                a.setHasLoan(true);
                a.setLoanApproved(true);
                a.request(a.getLoanAmount());
                loans.remove(a);
                for(int k = 0; k < ll.size(); k++)
                {
                    account b = ll.get(k);
                    if(b.getName().equalsIgnoreCase(a.getName()))
                    {
                        ll.remove(b);
                        ll.add(a);
                    }
                }
            }
            System.out.println("All loans approved!");
        }
        else
        {
            System.out.println("You do not have permission of this operation");
            return;
        }
    }

    public void change(employee e)
    {
        if(e.isChangeInterest())
        {
            Scanner br = new Scanner(System.in);
            String instruction = br.next();
            if(instruction.equalsIgnoreCase("student"))
            {
                instruction = br.next();
                student.setInterest(Double.parseDouble(instruction));
            }
            else if(instruction.equalsIgnoreCase("savings"))
            {
                instruction = br.next();
                savings.setInterest(Double.parseDouble(instruction));
            }
            else if(instruction.equalsIgnoreCase("fixed_deposit"))
            {
                instruction = br.next();
                fixed_deposit.setInterest(Double.parseDouble(instruction));
            }
            else if(instruction.equalsIgnoreCase("loan"))
            {
                instruction = br.next();
                loan.setInterest(Double.parseDouble(instruction));
            }
            else
            {
                instruction = br.next();
                System.out.println("Invalid account type");
            }
        }
    }

    public void driver() throws IOException {
        Scanner br = new Scanner(new InputStreamReader(System.in));
        String instruction = br.next();
        //System.out.println("Here 1");
        while(!instruction.equalsIgnoreCase("end"))
        {
            if(instruction.equalsIgnoreCase("open"))
            {
                String name = br.next();
                for(int i = 0; i < emp.size(); i++)
                {
                    employee e = emp.get(i);
                    if (e.getName().equalsIgnoreCase(name))
                    {
                        System.out.println(e.getName() + " has been opened");
                        instruction = br.next();
                        while(!instruction.equalsIgnoreCase("close"))
                        {
                            if(instruction.equalsIgnoreCase("lookup"))
                            {
                                lookup();
                            }
                            else if(instruction.equalsIgnoreCase("see"))
                            {
                                see(e);
                            }
                            else if(instruction.equalsIgnoreCase("approve"))
                            {
                                approve(e);
                            }
                            else if(instruction.equalsIgnoreCase("change"))
                            {
                                change(e);
                            }
                            else
                            {
                                System.out.println("Invalid instruction");
                            }
                            instruction = br.next();
                        }

                        if(instruction.equalsIgnoreCase("close"))
                        {
                            System.out.println("Operations for " + e.getName() + " has closed");
                            break;
                        }
                    }
                }
                for(int i = 0; i < ll.size(); i++)
                {
                    account acc = ll.get(i);
                    if(acc.getName().equalsIgnoreCase(name))
                    {
                        System.out.println(acc.getName() + " has been opened");
                        instruction = br.next();
                        while(!instruction.equalsIgnoreCase("close")){
                            if (instruction.equalsIgnoreCase("withdraw"))
                            {
                                instruction = br.next();
                                if(acc.withdraw(Double.parseDouble(instruction)))
                                {
                                    fund -= Double.parseDouble(instruction);
                                }
                            }
                            else if (instruction.equalsIgnoreCase("deposit"))
                            {
                                instruction = br.next();
                                if(acc.deposit(Double.parseDouble(instruction)))
                                {
                                    fund += Double.parseDouble(instruction);
                                }
                            }
                            else if(instruction.equalsIgnoreCase("request"))
                            {
                                instruction = br.next();
                                acc.reqLoan(Double.parseDouble(instruction));
                                loans.add(acc);
                            }
                            else if(instruction.equalsIgnoreCase("query"))
                            {
                                if(acc.isLoanApproved())
                                {
                                    System.out.println("Current balance: " + acc.getDepAmount() + "; Loan amount: " + acc.getLoanAmount());
                                }
                                else
                                {
                                    System.out.println("Current balance: " + (acc.getDepAmount()-acc.getLoanAmount()) + "; Loan amount: 0.0");
                                }
                            }
                            else
                            {
                                System.out.println("Invalid instruction");
                            }
                            instruction = br.next();
                        }
                        if(instruction.equalsIgnoreCase("close"))
                        {
                            System.out.println("Operations for " + acc.getName() + " has closed");
                            break;
                        }
                    }
                    for (int p = 0; p < ll.size(); p++)
                    {
                        account current = ll.get(p);
                        if(current.getName().equalsIgnoreCase(acc.getName()))
                        {
                            ll.remove(current);
                            ll.add(acc);
                        }
                    }
                }

            }
            else if (instruction.equalsIgnoreCase("create"))
            {
                create();
            }
            else if(instruction.equalsIgnoreCase("INC"))
            {
                for (int i = 0; i < ll.size(); i++)
                {
                    account a = ll.get(i);
                    a.increment();
                    ll.remove(i);
                    ll.add(a);
                }
            }
            else
            {
                System.out.println("Invalid instruction!");
            }
            instruction = br.next();
        }

    }
}
