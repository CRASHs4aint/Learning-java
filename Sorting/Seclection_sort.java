package Sorting;

public class Seclection_sort {
    public static void main(String[] args)
    {
        int[] arr = {6, 7, 3, 2, 8, 9};
        for (int i = 0; i < arr.length-1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }

            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }

    }
}
