package com.company;
import java.util.*;
public class PalNum {
    public static void main (String [] args){
        int num,rem,rev=0,a = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Enter number:");
        while(num !=0) {
            rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        if(num == a) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}
