package com.bl;

import java.util.Scanner;

public class Monthname {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the months number : ");
        int monthnumber;
        monthnumber = sc.nextInt();
        switch(monthnumber)
        {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septmber");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("Movember");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invaild month");
                break;
        }
    }
}
