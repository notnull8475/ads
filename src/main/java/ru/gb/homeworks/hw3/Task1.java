package ru.gb.homeworks.hw3;

import java.util.Arrays;

public class Task1 {


    public int getSkippedNumb(int[] array) {
        if (array.length > 0) {
            int lastNumb = array[array.length - 1];
            if (array.length == lastNumb) {
                return array.length + 1;
            }
            int findNumb = lastNumb;
//            самый простой метод - перебор O(n)
            for (int i = 0; i < lastNumb; i++) {
                if (array[i] != i + 1) {

                    findNumb = i + 1;
                    break;
                }
            }
            return findNumb;
        }
        return 1;
    }

    public int getSkippedNumbV2(int[] array) {
        if (array.length > 0 && array[0]==1) {
            int lastNumb = array[array.length - 1];
            if (array.length == lastNumb) {
                return array.length + 1;
            }
            IntRef res = new IntRef();
            res.value = 0;
            return division(array, res);
//            return res;
        }
        return 1;

    }


    private int division(int[] a, IntRef res) {
        if (a.length != (a[a.length - 1] - a[0] + 1)) {
            if (a.length > 5) {
                int mid = a.length / 2; // 7/2 = 3
                int[] la = new int[mid]; //3
                int[] ra = new int[a.length - mid]; //7 - 3 = 4

                for (int i = 0; i < mid; i++) {
                    la[i] = a[i];
                }
                for (int i = mid; i < a.length; i++) {
                    ra[i - mid] = a[i];
                }
//                System.arraycopy(a, 0, la, 0, mid);
//                System.arraycopy(a, mid + 1, ra, 0, a.length - mid);
                division(la, res);
                division(ra, res);
            } else {
                int f = a[0];
                int l = a[a.length - 1];

                for (int i = 0; i < l - f; i++) {
                    if (a[i] != f + i) {
                        System.out.println(a[i] + "  " + (f+i));
                        res.value = f + i;
                        System.out.println(res.value);
                        return res.value;
                    }
                }
            }
        }
        return res.value;
    }
    public class IntRef { public int value; }
}
