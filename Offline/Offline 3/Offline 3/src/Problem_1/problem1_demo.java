package Problem_1;

import java.io.File;
import java.io.IOException;

public class problem1_demo {
    public static void main(String[] args) throws IOException {
        spaceSum spacesum = new spaceSum();
        File file = new File("input_tilde.txt");
        tildeSum adapterObj = new SumAdapter(spacesum);
        System.out.println(adapterObj.calcTildeSum(file));
    }
}
