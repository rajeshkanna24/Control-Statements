package com.bl;

import java.util.Scanner;

public class Whileloop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt(),reverse=0;
        while(number !=0)
        {
            int reminder = number %10;
            reverse = reverse*10+reminder;
            number=number/10;
        }
        System.out.println("The reverse of the given number is: "+reverse);
    }

}
