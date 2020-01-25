package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task7 {

    /*7*) Написать метод который повернет матрицу на 90 градусов. Например:
1,2,3
4,5,6*/
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int arr[][] = new int[a][b];
        initArray(arr);
        turnArray(arr, a, b);
    }

    private static void turnArray(int[][] arr, int a, int b) {
        int arr2[][] = new int[b][a];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[j][a - i - 1] = arr[i][j];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }


    private static void initArray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(99);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}