//package Sorting;
//
//public class Merge_sort {
//    public static void main(String[] args) {
//        int[] arr = {6, 7, 3, 2, 8, 9};
//        MergeSort(arr);
//        for(int num : arr){
//            System.out.print(num + " ");
//        }
//    }
//    public static  void MergeSort(int[] arr){
//        int n=arr.length;
//        int[] a =new int[n/2];
//        int[] b =new int[n-n/2];
//        int idx=0;
//        for(int i=0;i<a.length;i++){
//            a[i]=arr[idx+i];
//        }
//        MergeSort(a);
//        MergeSort(b);
//        merge(a,b,arr);
//
//    }
//    public static void merge(int [] a,int [] b,int [] c){
//        int i=0,j=0,k=0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]) c[k++]=a[i++];
//            else c[k++]=b[j++];
//        }
//        while(i<a.length) c[k++]=a[i++];
//        while(i<b.length) c[k++]=b[j++];
//    }
//}
package Sorting;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 2, 8, 9};
        MergeSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void MergeSort(int[] arr) {
        if (arr.length <= 1) return;   // Base case

        int n = arr.length;
        int mid = n / 2;

        int[] a = new int[mid];
        int[] b = new int[n - mid];

        // Copy first half
        for (int i = 0; i < mid; i++) {
            a[i] = arr[i];
        }

        // Copy second half
        for (int i = mid; i < n; i++) {
            b[i - mid] = arr[i];
        }

        MergeSort(a);
        MergeSort(b);

        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
}
