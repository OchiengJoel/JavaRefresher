package org.example;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args){

        //Scanner Object
        Scanner scanner = new Scanner(System.in);

        //Prompt User Input
        System.out.println("Enter First Number...");
        double numb1 = scanner.nextDouble();

        //Prompt User For Second Number
        System.out.println("Enter The Second Number");
        double numb2 = scanner.nextDouble();

        scanner.close();

        //Calculate Summation
        double sum = numb1 + numb2;
        System.out.println("Sum of: " + numb1 + " and " + numb2 + " is: " + sum);
    }
}
