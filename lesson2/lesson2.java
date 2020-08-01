package repo_java1_Home_Work.lesson2;

import java.util.Arrays;

public class lesson2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] arr2_1 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeNumberArr1(arr1);
        fillValueArr3_1(arr2_1);
        multiNumberArr(arr3);
        System.out.println(Arrays.toString(arr1)); // print to check
        System.out.println(Arrays.toString(arr2_1)); // print to check
        System.out.println(Arrays.toString(arr3)); // print to check

        int[] arr4_2 = {4, 1, 0, 6, 2, 9, 1}; // task 4 (в одном цикле, ниже в разных методах)
        int maxN = arr4_2[0], minN = arr4_2[0];
        for (int i = 0; i < arr4_2.length; i++) {
            if (arr4_2[i] > maxN) {
                maxN = arr4_2[i];
//                System.out.println("maxN = " + maxN); print to check
            } else if (minN > arr4_2[i]) {
                minN = arr4_2[i];
//                System.out.println("minN = " + minN);  print to check
            }
        }
    }

    private static void changeNumberArr1 ( int[] arr1_2){
        for (int i = 0; i < arr1_2.length; i++) {
            if (arr1_2[i] == 0) {
                arr1_2[i] = 1;
            } else arr1_2[i] = 0;
        }
    }

    private static void fillValueArr3_1 ( int[] arr2_2){
        for (int i = 0; i < arr2_2.length; i++) {
            arr2_2[i] = i * 3 + 1;
        }
    }

    private static void multiNumberArr (int[] arr3_1){
        for (int i = 0; i < arr3_1.length; i++) {
            if (arr3_1[i] < 6) {
                arr3_1[i] *= 2;
            } // else arr3_1[i] = arr3_1[i]; - лишнее
        }
    }

    private static void searchMaxElements ( int[] arr4_2){
        int maxN = arr4_2[0];
        for (int i = 0; i < arr4_2.length; i++) {
            if (arr4_2[i] > maxN) {
                maxN = arr4_2[i];
            }
        }
    }

    private static void searchMinElements ( int[] arr4_2){
        int minN = arr4_2[0];
        for (int i = 0; i < arr4_2.length; i++) {
            if (arr4_2[i] < minN) {
                minN = arr4_2[i];
            }
        }
    }
}
