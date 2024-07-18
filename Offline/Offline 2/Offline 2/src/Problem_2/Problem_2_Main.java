package Problem_2;

import java.util.Scanner;

public class Problem_2_Main {
    public static void main(String[] args) {
        String file_name;
        Scanner scanner = new Scanner(System.in);
        String c;
        while(true)
        {
            System.out.println("Do you want to input a file name? Y/N");
            c = scanner.nextLine();
            if (c.equalsIgnoreCase("n")) break;
            System.out.println("Enter the name of the file: ");
            file_name = scanner.nextLine();
            System.out.println(file_name);
            String file_type = file_name.split("\\.")[1];
            //System.out.println(file_type.length);

            Editor editor = Editor.getInstance();

            editor.setLanguage(file_type);
        }

    }
}
