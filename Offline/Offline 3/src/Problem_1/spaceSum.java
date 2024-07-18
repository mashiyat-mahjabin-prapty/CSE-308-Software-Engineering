package Problem_1;

import java.io.*;

public class spaceSum {
    private FileReader fileReader;
    private int sum;

    public spaceSum()
    {

    }

    public int calcSpaceSum(File file) throws IOException {
        this.fileReader = new FileReader(file);
        sum = 0;
        String input = "";
        int i;
        while((i=fileReader.read())!=-1)
            input = input + (char)i;
        fileReader.close();
        String[] numbers;
        numbers = input.split(" ");

//        for(int j = 0; j < numbers.length; j++)
//        {
//            System.out.println(numbers[j]);
//        }

        for(int j = 0; j < numbers.length; j++)
        {
            sum += Integer.valueOf(numbers[j]);
        }
        return sum;
    }

//    public static void main(String[] args) throws IOException {
//        spaceSum spacesum = new spaceSum();
//        File file = new File("input_space.txt");
//        System.out.println(spacesum.calcSpaceSum(file));
//    }
}
