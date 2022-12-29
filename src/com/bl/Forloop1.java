package com.bl;
import java.util.Scanner;
public class Forloop1 {
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num =sc.nextInt();
        int i,sum=0;
        for(i=0;i<=num;i++)
        {
            sum =sum+i;
        }
        System.out.println("sum of numbers is:"+sum);
    }
}
