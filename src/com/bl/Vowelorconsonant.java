package com.bl;
import javax.swing.*;
import java.util.Scanner;
public class Vowelorconsonant {
    public static void main(String[] args) {
        boolean isVowel=false;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a charcter : ");
         char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel =true;
        }
        if(isVowel == true)
        {
            System.out.println(ch+"is a vowel");
        }
        else {
            if (((ch >= 'a' && ch <= 'z'))||((ch >= 'A' && ch <= 'Z')))
            System.out.println(ch + "is a consonant");
        }
    }
}
