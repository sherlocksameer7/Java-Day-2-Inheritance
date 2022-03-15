package com.Inheritance.projectHarman;    // This is Child class........

import java.util.Scanner;

public class Calculations extends Operations   // Inherits the Parent class to the Child class
{
    public int Multiply2Numbers(int a,int b)
    {
        return a*b;   // These are all accessed with only Child CLass not Parent Class***
    }

    public static void main(String[] args)
    {
        Calculations calc = new Calculations();
        Scanner input = new Scanner(System.in);

        int x, y, addResult, subResult, mulResult;
        System.out.println("Enter 1st Num: ");
        x = input.nextInt();
        System.out.println("Enter 2nd Num: ");
        y = input.nextInt();
        addResult = calc.Add_two_numbers(x, y);
        subResult = calc.Sub_two_numbers(x, y);  // But, the above two are Accessed with Parent Class as well as Child Class
        mulResult = calc.Multiply2Numbers(x, y);  // This is only accessed with Child Class only!!!!****
        System.out.println("Addition "+addResult);
        System.out.println("Subtraction "+subResult);
        System.out.println("Multiplication "+mulResult);
    }

}
