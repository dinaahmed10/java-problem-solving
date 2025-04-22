//https://www.w3resource.com/java-exercises/conditional-statement/index.php
//
//        6. Compare Floats Up to Three Decimals
//
//        Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//
//        Test Data
//        Input floating-point number: 25.586
//        Input floating-point another number: 25.589
//        Expected Output :
//        They are different

package problems.if_else;

import java.util.Locale;
import java.util.Scanner;

public class CompareFloatsUpToThreeDecimals {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number1:");
        float number1= input.nextFloat();
        System.out.print("Please enter the number2:");
        float number2= input.nextFloat();
        //for printing
        //System.out.printf("%.3f and %.3f" ,number2,number1);

        number1= (float) Math.round(number1 * 1000) /1000;
        number2=(float) Math.round(number2 *1000)/1000;

        if(number1==number2){
            System.out.println("They are the same up to three decimal places");
        } else
        {
            System.out.println("They are different");
        }
    }
}
