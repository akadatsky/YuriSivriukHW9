package com.company;

import java.util.Arrays;

public class Task2_1 {

    /*2.1*) Написать метод который принимает 2 матрицы одного размера и вернет сумму 2 матриц
     - каждый элемент будет суммой соотв. элементов матриц параметров.*/
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{{1, 5}, {1, 7}};
        int[][] matrix2 = new int[][]{{8, 4}, {3, 1}};
        int[][] sum = sum(matrix1, matrix2);
        for (int[] Sum : sum) {
            System.out.printf(Arrays.toString(Sum));
        }
    }

    public static int[][] sum(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2.length; j++)
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
        return sum;
    }

}