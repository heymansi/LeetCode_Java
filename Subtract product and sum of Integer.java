package com.hemansi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n>0)
        {
            int rem = n%10;
            sum = sum+rem;
            product = product * rem;
            n = n/10;
        }
        return product - sum;
    }
}
