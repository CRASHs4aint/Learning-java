package Sorting;

public class Bubble_sort {
    static void main() {
        int[] arr = {6, 7, 3, 2, 8, 9};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if ( arr[j] >arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }

    }
}
