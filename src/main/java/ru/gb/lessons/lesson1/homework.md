2. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
   a)
 
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i*=4) {  O(n)
            for (int j = 1; j < n; j *= 2) { O(log(n))
                arrayList.add(i * j);
            }
        }
        O(log_4(n)log(n))
b)

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) { O(n/2) ~ O(n)
            for (int j = i; j < n; j++) { n + n - 2 + n - 4 + ... O(n)
                arrayList.add(i * j);
            }
        }
        O(n^2)
с)

        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) { 
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
                n--;
            }
        }
        O(n)

        // i = 0    j = 0, n = 10_000, j = 1, n == 9_999, j = 2, n = 9_998 .... j = 5000, n = 5000
        // i = 1    j = 0, n = 4_999, j = 1, n == 4_998,                                  n = 2500
        // i = 2    j = 0, n = 2_499, j = 1, n == 2_498,                                  n = 1250
        // ...
        // i ~ 10  n = 0
        
d*)
```

    factorial(12)

public static int factorial(int n) {
    if (n == 1) {
        return n;
    }
    return n * factorial(n - 1);
}

O(n)