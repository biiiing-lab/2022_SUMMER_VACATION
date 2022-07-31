package Baekjoon.JAVA;

import java.util.Scanner;

public class Q1834re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = 0;

        for (long i = 0; i < n; i++) {
            a += (n + 1) * i;

        }
        System.out.println(a);

    }
}
