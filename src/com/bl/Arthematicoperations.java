package com.bl;

import java.util.Scanner;

public class Arthematicoperations {
    public static void main(String[] args) {
        int num1=0,num2=0,num3=0,sum1=0,sum2=0,sum3=0,sum4=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the values :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        sum1 = ((num1 + num2)*num3);
        sum2=((num3+num1)/num2);
        sum3=((num1%num2)+num3);
        sum4=((num1*num2)+num3);
        System.out.println(" "+sum1);
        System.out.println(" "+sum2);
        System.out.println(" "+sum3);
        System.out.println(" "+sum4);
        if(sum1 == sum2&&sum2== sum3  || sum3 ==sum4 && sum4==sum1)
        {
            System.out.println("");
        }

    }
}
