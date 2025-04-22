//  https://www.w3resource.com/java-exercises/conditional-statement/index.php

//5. Weekday Name from Number
//
//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//        Test Data
//Input number: 3
//Expected Output :
//Wednesday

package problems.if_else;

import java.util.Scanner;

public class WeekdayNameFromNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int Number= input.nextInt();

        switch(Number){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid Number");
                break;
        }

    }
}
