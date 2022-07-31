package Baekjoon.JAVA;

import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
            sum += array[i] * array[i];
        }
        System.out.println(sum % 10);
    }
}
