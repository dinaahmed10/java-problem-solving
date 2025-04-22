// https://www.w3resource.com/java-exercises/conditional-statement/index.php

//3. Find Greatest Among Three Numbers
//
//        Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output :
//        The greatest: 87

package problems.if_else;

import java.util.Scanner;

public class FindGreatestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the first number:");
        int Number1= input.nextInt();
        System.out.print("Please enter the first number:");
        int Number2= input.nextInt();
        System.out.print("Please enter the first number:");
        int Number3= input.nextInt();

        int greatest = Number1;
        if (Number2 > greatest) greatest = Number2;
        if (Number3 > greatest) greatest = Number3;

        System.out.println("The greatest number is: " + greatest);
    }

}
