package com.bl;

import java.util.Scanner;

public class Quadraticequation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c=sc.nextDouble();
        double d = b*b -4.0*a*c;
        if(b>0)
        {
            double r1 =(-b+Math.pow(d,0.5))/(2.0*a);
            double r2 =(-b-Math.pow(d,0.5))/(2.0*a);
            System.out.println("The roots are" +r1+ "and" +r2);
        }
        else if(d==0.0)
        {
            double r1 = -b/(2.0*a);
            System.out.println("The roots is " +r1);
        }
        else {
            System.out.println("Roots are not Real");
        }
    }
}
