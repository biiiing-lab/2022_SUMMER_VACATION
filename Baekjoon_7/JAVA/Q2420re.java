package Baekjoon.JAVA;

import java.util.Scanner;

public class Q2420re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt(); // 자료형 주의

        if ((a - b) < 0) {
            System.out.println(-(a - b));
        }
        else if ((a - b) >= 0) {
            System.out.println((a - b));
        }
    }
}
