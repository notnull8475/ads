package ru.gb.homeworks.hw3;

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
        if (array.length > 0 && array[0] == 1) {
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
                int mid = a.length / 2;
                int[] la = new int[mid];
                int[] ra = new int[a.length - mid];

                for (int i = 0; i < mid; i++) {
                    la[i] = a[i];
                }
                for (int i = mid; i < a.length; i++) {
                    ra[i - mid] = a[i];
                }
                division(la, res);
                division(ra, res);
            } else {
                int f = a[0];
                int l = a[a.length - 1];

                for (int i = 0; i < l - f; i++) {
                    if (a[i] != f + i) {
                        res.value = f + i;
                        return res.value;
                    }
                }
            }
        }
        return res.value;
    }

    private static class IntRef {
        public int value;
    }
}
