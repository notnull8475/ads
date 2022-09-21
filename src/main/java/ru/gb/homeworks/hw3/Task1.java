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
        if (array.length > 0) {
            int lastNumb = array[array.length - 1];
            if (array.length == lastNumb) {
                return array.length + 1;
            }
            Integer res = 0;
            division(array, res);
            return res;
        }
        return 1;

    }


    private void division(int[] a, Integer res) {

        if (a.length != (a[a.length - 1] - a[0] + 1)) {
            if (a.length > 4) {
                int mid = a.length / 2; // 7/2 = 3
                int[] la = new int[mid]; //3
                int[] ra = new int[a.length - mid]; //7 - 3 = 4
                System.arraycopy(a, 0, la, 0, mid);
                System.arraycopy(a, mid + 1, ra, 0, a.length - mid);
                division(la, res);
                division(ra, res);
            } else {
                int f = a[0];
                int l = a[a.length - 1];

                for (int i = 0; i < l - f; i++) {
                    if (a[i] != f + i) {
                        res = f + 1;
                        break;
                    }
                }
            }
        }
    }

}
