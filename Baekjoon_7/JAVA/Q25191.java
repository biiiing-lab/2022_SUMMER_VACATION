package Baekjoon.JAVA;

import java.util.Scanner;

public class Q25191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        b /=  2;
        int result = b + c;

        if(a < result) {
            System.out.println(a);
        }
        else if(a > result) {
            System.out.println(result);
        }
        else if(a == result) {
            System.out.println(result);
        }

    }
}

