package Algorithm;

import Algorithm.D12;

public class InsertionSort {
    public static void sort(int[] a){
        int n = a.length;

        for(int i = 1; i < n; i++){
            int j = i;
            while (j >= 1 && a[j - 1] > a[j]){
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }

            D12.print(a);
        }
    }
}
