package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {

    /*2.2*) Написать 2 метода, которым передают матрицу и индексы a, b
Первый метод должен поменять 2 строки матрицы местами второй 2 столбца*/
    public static void main(String[] args) {


        int[][] arr = new int[4][5];

        int A = 0;
        int B = 1;

        initArray(arr);
        changeLines(arr, A, B);
        changeColumns(arr, A, B);
    }

    private static void changeColumns(int[][] arr, int A, int B) {
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i][A];
            arr[i][A] = arr[i][B];
            arr[i][B] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void changeLines(int[][] arr, int A, int B) {
        int tmp[] = arr[A];
        arr[A] = arr[B];
        arr[B] = tmp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(" ");
    }


    private static void initArray(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(99);
            }
        }
    }
}