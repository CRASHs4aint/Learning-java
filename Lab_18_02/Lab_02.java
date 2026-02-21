package Lab_18_02;

public class Lab_02 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 2, 8, 9};

        for (int i = 1; i < arr.length; i++) {

            int j = i;
            int key=arr[j-1];

            while (j > 0 && arr[j] < key) {
               int location= Binary(arr,key);
                int temp = arr[j];
                arr[j] = key;
                key = temp;
                j--;
                System.out.println(location);
            }
        }


        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public  static int Binary( int[] arr,int key){
        int L,R,mid;
        L=0;
        R=arr.length-1;
        while(L<=R){
            mid=(L+R)/2;
            if(key==arr[mid]) return mid;
            if(key<arr[mid]) R=mid-1;
            else L=mid+1;
        }
        return -1;

    }
}
