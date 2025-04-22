//https://www.w3resource.com/java-exercises/conditional-statement/index.php


//1. Check Positive or Negative Number
//
//Write a Java program to get a number from the user and print whether it is positive or negative.
//
//        Test Data
//Input number: 35
//Expected Output :
//Number is positive

package problems.if_else;

import java.util.Scanner;

public class CheckPositiveOrNegativeNumber {
    public static void main(String[] args) {
        System.out.print("Input number: ");
        Scanner input =new Scanner(System.in);
        int Number=input.nextInt();
        if(Number>0){
            System.out.println("Number is positive");
        }else if(Number < 0){
            System.out.println("Number is Negative");
        }
         else
        {
            System.out.println("Number is zero");
        }
    }
}
