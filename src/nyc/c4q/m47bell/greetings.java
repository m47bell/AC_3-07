package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 3/7/15.
 */

import java.util.Scanner;
public class greetings {
    public static void main(String []args){
        String greeting;

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Greet me:");

            greeting = input.nextLine();

            if (greeting.equalsIgnoreCase("exit")) {
                return;
            }

            System.out.println(greeting);

        }













    }






}
