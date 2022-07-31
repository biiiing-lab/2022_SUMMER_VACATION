package Baekjoon.JAVA;

import java.util.Scanner;

public class Q1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int[] array = new int[input];

        for(int i = 0; i < input; i++) {
            array[i] = sc.nextInt();
        }

            if((array[1] - array[0]) == (array[input-1] - array[input-2])){
                int a = array[1] - array[0];
                System.out.println(a + array[input - 1]);
            }
            else if((array[1] % array[0]) == (array[input-1] % array[input-2])) {
                int b = array[1] / array[0];
                System.out.println(array[input - 1] * b);
            }
        }
    }
