package Baekjoon.JAVA;

import java.util.Scanner;

public class Q2420 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();

    if (a < 0 && b >= 0) {
        a = -a;
        System.out.println(a + b);
    }
    else if (a < 0 && b < 0) {
        a = -a;
        b = -b;
        long result = a - b;
        if (result < 0) {
            result = -result;
        }
        System.out.println(result);
    }
    else if (a >= 0 && b < 0) {
        b = -b;
        System.out.println(a + b);
    }
    else if(a >= 0 && b >= 0) {
        long result = a - b;
        if (result < 0) {
            result = -result;
        }
        System.out.println(result);
    }
}
}
