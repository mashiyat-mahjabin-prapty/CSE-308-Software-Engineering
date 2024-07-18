public class GradeCalculator {
    public String grade(double marks, int credit)
    {
        if(marks < 0)
        {
            return "Invalid Number";
        }
        if(Double.isNaN(marks))
        {
            return "Not a number";
        }
        int rounded_val = (int) Math.ceil(marks);
        if(credit == 3)
        {
            return getGrade3cred(rounded_val);
        }
        else if(credit == 4)
        {
            return getGrade4cred(rounded_val);
        }
        else
        {
            return "Invalid credit";
        }
    }

    private String getGrade3cred(double marks)
    {
        if(marks >= 240 && marks <= 300)
        {
            return "A";
        }
        else if(marks >= 210 && marks <= 239)
        {
            return "B";
        }
        else if(marks >= 180 && marks <= 209)
        {
            return "C";
        }
        else if(marks >=0 && marks < 180 && marks >= 0)
        {
            return "F";
        }
        else if(marks > 300)
        {
            return "Exceeded upper bound";
        }
        return "";
    }

    private String getGrade4cred(double marks)
    {
        if(marks >= 320 && marks <= 400)
        {
            return "A";
        }
        else if(marks >= 280 && marks <= 319)
        {
            return "B";
        }
        else if(marks >= 240 && marks <= 279)
        {
            return "C";
        }
        else if(marks >=0 && marks < 240 && marks >= 0)
        {
            return "F";
        }
        else if(marks > 400)
        {
            return "Exceeded upper bound";
        }
        return "";
    }
}
