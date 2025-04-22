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
