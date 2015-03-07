package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/7/15.
 *
 * Access Code 2.1
 * Marbella, George
 * Madlibs Excerise
 *
 * objective: This program should prompt the user for a minimum of six inputs (text inputs with at least one number) and then print out your "mad lib" result! Here is a sample partial run:
 */

import java.util.Scanner;
public class madLibs {
    public static void main(String []args){

        Scanner input = new Scanner(System.in);

        //prompt user to enter an adjective
        System.out.println("Enter an adjective: " );

        //save adjective
        String adjective = input.nextLine();

        //Prompt user to enter another adjective
        System.out.println("Enter another adjective: ");

        //Save  another adj.
        String adjective2 = input.nextLine();

        //Prompt user to enter a noun
        System.out.println("Enter a noun: ");

        //save noun
        String noun = input.nextLine();

        //Prompt user to enter another noun
        System.out.println("Enter another noun: ");

        //save another noun
        String noun2 = input.nextLine();

        //prompt user to enter a fav number
        System.out.println("Enter your favorite number: ");

        //save your fav. num
        int favNum = input.nextInt();

        //prompt ypur second favorite number
        System.out.println("Enter your second favorite number: ");

        //save second fav num
        int favNum2 = input.nextInt();

        //output
        System.out.println("Here is your mad lib!!\n" + "The " + adjective+
                " bear went into the "+ adjective2 + " house.\n " + "There she saw a " + noun +
                " and a " + noun2 + ".\n" + "The time was from " + favNum + " to "+ favNum2 +" .");


    }



}
