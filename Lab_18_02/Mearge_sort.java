package Lab_18_02;

public class Mearge_sort {
    static void main() {
        int[] a = {3, 1, 6, 9, 5};
        MergeSort(a);
        for(int i=0;i<a.length;i++){
            System.out.printf("%d",a[i]);
        }
    }

    static void MergeSort(int[] a) {
        if (a.length <= 1) return;


        int n = a.length;

        int[] arr = new int[n / 2];
        int[] brr = new int[n - n / 2];

        for (int i = 0; i < n / 2; i++) {
            arr[i] = a[i];
        }

        for (int i = n / 2; i < n; i++) {
            brr[i - n / 2] = a[i];
        }
//        for (int i = 0; i < brr.length; i++) {
//            System.out.printf("%d",brr[i]);
//        }

        MergeSort(arr);


        MergeSort(brr);


        merge(arr, brr, a);
    }

    static void merge(int[] arr, int[] brr, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] <= brr[j]) c[k++] = arr[i++];
            else c[k++] = brr[i++];
        }
        while (i < arr.length) c[k++] = arr[i++];
        while (j < brr.length) c[k++] = brr[j++];
    }
}
