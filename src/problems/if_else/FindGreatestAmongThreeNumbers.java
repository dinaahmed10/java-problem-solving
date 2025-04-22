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

        if(Number1>Number2 &&Number1>Number3){
            System.out.println("The greatest number is: " + Number1);
        }
        else if(Number2>Number1 &&Number2>Number3){
            System.out.println("The greatest number is: " + Number2);
        }
        else{
            System.out.println("The greatest number is: " + Number3);
        }
    }

}
