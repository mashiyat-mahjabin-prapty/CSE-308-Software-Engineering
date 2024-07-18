package Problem_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumAdapter implements tildeSum {
    private spaceSum spacesum;
    private FileWriter fileWriter;
    private FileReader fileReader;

    public SumAdapter(spaceSum spacesum)
    {
        this.spacesum = spacesum;
    }

    public int calcTildeSum(File file) throws IOException
    {
        File spaceFile = new File("input_space.txt");
        fileWriter = new FileWriter(spaceFile);
        this.fileReader = new FileReader(file);
        String input = "";
        int i;
        while((i=fileReader.read())!=-1)
            input = input + (char)i;
        fileReader.close();
        String[] numbers;
        numbers = input.split("~");
//        for(int j = 0; j < numbers.length; j++)
//        {
//            System.out.println(numbers[j]);
//        }
        for(int j = 0; j < numbers.length; j++)
        {
            fileWriter.write(numbers[j] + " ");
        }
        fileWriter.close();
        int sum;
        sum = spacesum.calcSpaceSum(spaceFile);
        spaceFile.delete();

        return sum;
    }
}
