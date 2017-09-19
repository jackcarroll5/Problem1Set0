package com.example.problem1set0;

/**
 * Created by T00194823 on 13/09/2017.
 */

import java.util.Scanner;

public class Problem1Set0 {
    public static void main(String[] args)
    {
        String name,className;
        int snacks,price;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your class name: ");
        className = input.nextLine();

        System.out.print("How many snacks would you like?:" );
        snacks = input.nextInt();

        price = snacks * 2;

        System.out.println("Your name is " + name + "/nYour class name is " + className +
        "/nYou asked for " + snacks + " snacks. /nYou must pay " + price + " euros");
    }
}
