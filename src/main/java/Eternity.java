/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

import java.util.Scanner;

public class Eternity {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        driver();
    }

    public static void driver() {

        System.out.println("--------------------------------");
        System.out.println("Calculator for calculating the function ab^x, please enter numbers");
        System.out.println("--------------------------------");
        System.out.println("Enter the value a:");
        double a = read();
        System.out.println("--------------------------------");
        System.out.println("Enter the value b:");
        double b = read();
        System.out.println("--------------------------------");
        System.out.println("Enter the Power x:");
        double x = read();
        System.out.println("--------------------------------");
        try {
            System.out.println("The results of ab^x is :" + ExponentFunction.calculate(a, b, x));
            System.out.println("--------------------------------");
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("Something went wrong!");
        }
    }

    public static double read() {
        double aDoubleNumber;
        do {
            try {
                System.out.print(">>> ");
                aDoubleNumber = Double.parseDouble(input.nextLine());
                break;
            } catch (Exception ignored) {
                System.out.println("Please enter the valid number");
            }
        }
        while (true);

        return aDoubleNumber;
    }

}