package Vedant.Recursion;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4,5};
        System.out.println(LS(arr, 4, 0));
        System.out.println(LSI(arr, 4, 0));
        System.out.println(LSIndexLast(arr, 4, arr.length - 1));

    }

    static boolean LS(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || LS(arr, target, index + 1);
    }

    static int LSI(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return LSI(arr, target, index + 1);
        }
    }

    static int LSIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {
            return LSIndexLast(arr, target, index - 1);
        }
    }


}
