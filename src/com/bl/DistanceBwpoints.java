package com.bl;

import java.util.Scanner;

public class DistanceBwpoints {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;
        System.out.println("Enter x1 point");
        x1=sc.nextInt();
        System.out.println("Enter y1 point");
        y1=sc.nextInt();
        System.out.println("Enter x2 point");
        x2=sc.nextInt();
        System.out.println("Enter y2 point");
        y2=sc.nextInt();
        dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")=>"+dis);
    }
}
