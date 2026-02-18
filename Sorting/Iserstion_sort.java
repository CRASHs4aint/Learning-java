//package Sorting;
//
//public class Iserstion_sort {
//    public static void main(String[] args){
//        int[] arr = {6, 7, 3, 2, 8, 9};
//        for(int i=1;i<arr.length;i++){
//            int j=i;
//            while(j>=1 && arr[j]<arr[j-1]){
//                swap(arr[j];arr[j-1]);
//                j--;
//            }
//        }
//    }
//    void swap(int ar)
//}
package Sorting;

public class Iserstion_sort {

    public static void main(String[] args){
        int[] arr = {6, 7, 3, 2, 8, 9};

        for(int i = 1; i < arr.length; i++){
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                // swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        // Print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
