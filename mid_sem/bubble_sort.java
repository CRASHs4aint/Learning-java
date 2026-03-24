package mid_sem;

public class bubble_sort {
    static void main() {
        int[] arr={5,8,9,0,7};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i] );
        }
    }
}
