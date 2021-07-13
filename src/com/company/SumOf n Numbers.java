package com.company;
import java.util.*;
public class AddNNum {
    static public void main(String [] args){
          int i,sum =0;
        Scanner am = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int num = am.nextInt();

        for(i = 0;i<=num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
