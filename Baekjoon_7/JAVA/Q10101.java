package Baekjoon.JAVA;

import java.util.Scanner;

public class Q10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a + b + c) == 180) {

            if (a == 60 && b == 60 && c == 60) {
                System.out.println("Equilateral");
            }
            else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Error");
        }
    }
}
