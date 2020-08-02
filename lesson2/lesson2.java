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
//            arr[i] = (arr[i] == 1)? 0 : 1;
//            arr[i] ^= 1;
//            arr[i] = arr[i] ^ 1;
        }
    }

    private static void fillValueArr3_1 ( int[] arr2_2){
        for (int i = 0; i < arr2_2.length; i++) {
            arr2_2[i] = i * 3 + 1;
        }
    }

//    private static void arrNum ( int[] a, int step, int shift){
//        for (int i = 0; i < a.length; i++) {
//            a[i] = i * step + shift; // всесто фикс значений 3 и 1
//        }
//    }

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
    private static void arrDiagonaly ( int[][] arr5){
        for (int y = 0; y < arr5.length; y++) {
            arr5[y][y] = 1;
            arr5[y][arr5.length - 1 - y] = 1;
        }
    }

    private static boolean chekBalace(int[] arr) {
        int right = 0, left = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            left = left + arr[i];
            for (int j = i + 1; j < arr.length; j++)
                right = right + arr[j];
            if (right == left) return true;
            right = 0;
        }
        return false;
    }

    private static boolean chekBalace2(int[] arr) {
        int sumArr = 0;// rigth = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArr = sumArr + arr[i];
        }
        return sumArr % 2 == 0;
//        for (int j = 0; j < arr.length; j++) {
//            rigth = rigth + arr[j];
//            if (rigth == sumArr) return true;
//        }
//        return true;
    }

    private static void shifter(int[] arr, int value) {
        boolean dis;
        if (value < 0) {
            dis = true;
            value = -value;
        } else dis = false;

        value %= arr.length;
        int lastInd = arr.length - 1;

        for (int i = 0; i < value; i++) {
            int temp = (dis) ? arr[0] : arr[lastInd];
            for (int j = 0; j < lastInd; j++) {
                if (dis)
                    arr[j] = arr[j + 1];
                else
                    arr[lastInd - j] = arr[lastInd - j - 1];
            }
            if (dis)
                arr[lastInd] = temp;
            else
                arr[0] = temp;
        }
    }

    private static void shifter2(int[] arr, int value) {
        boolean dis = (value < 0);
        if (dis) value = -value;

        value %= arr.length;
        if (value == 0) return;
        int shifter = (dis) ? arr.length - value : value;

        int lastInd = arr.length - 1;
        for (int i = 0; i < shifter; i++) {
            int temp = arr[arr.length - 1];
            for (int j = 0; j < lastInd; j++) {
                arr[lastInd - j] = arr[lastInd - j - 1];
//           System.arraycopy(arr, 0, arr, 1, arr.length - 1); // вместо второго for
            }
            arr[0] = temp;
        }
    }
}
