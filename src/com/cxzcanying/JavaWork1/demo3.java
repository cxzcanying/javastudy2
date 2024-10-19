package com.cxzcanying.JavaWork1;

import java.util.Arrays;
import java.util.Comparator;

public class demo3 {
    public static void main(String[] args) {
        int[] arr1={8,6,5,6,8,6,1,8,4,0};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n--------------");


        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                sum+=arr2[i][j];
            }
        }
        System.out.println("二维数组求和"+sum);
        System.out.println("----------------");

        Arrays.sort(arr1);
        System.out.println("排序后数组为：");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
