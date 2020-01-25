package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    /*6*) написать метод который преобразует матрицу в одномерный массив.
     Например если матрица была 3x4 то массив будет на 12 элементов.*/
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][4];
        int[] array2 = new int[3 * 4];
        int index = 0;
        System.out.println("Матрица:");
        modifyingMatrix(array, array2, index, random);
        System.out.println("\nArray2: " + Arrays.toString(array2));
    }

    public static void modifyingMatrix(int[][] array, int[] array2, int index, Random random) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
                array2[index++] = array[i][j];
            }
            System.out.println();
        }
    }

}