package Problem_1;

import Problem_1.Builder.*;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Welcome to Queue Management System:");
        System.out.println("Choose a package:");
        System.out.println("1. Deluxe: LCD panel with Raspberry Pi\n" +
                "2. Optimal: Arduino Mega with LED matrix\n" +
                "3. Poor: ATMega32 with LED matrix");
        Scanner scanner = new Scanner(System.in);
        int pp = scanner.nextInt();
        System.out.println("Enter the number of display units:");
        int num = scanner.nextInt();
        System.out.println("Choose a communication channel:");
        System.out.println("1. WiFi \n2. Mobile Internet");
        int com = scanner.nextInt();
        String comChannel;
        if (com == 1) comChannel = "Broadband";
        else comChannel = "Mobile_Internet";
        IBuilder iBuilder;
        if (pp == 1)
        {
            iBuilder = new DeluxeType(num, comChannel);
        }
        else if(pp == 2)
        {
            iBuilder = new OptimalType(num, comChannel);
        }
        else
        {
            iBuilder = new PoorType(num, comChannel);
        }
        Product product = iBuilder.getProduct();
        product.show();
        product.getCost();
    }
}
