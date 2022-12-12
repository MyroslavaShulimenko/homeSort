import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[] { 2, 6, 87, 1, 0, 52, 42, 1, 5, 7 };
        quirckSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quirckSort(int[]arr,int low,int higt){
        if  (low<higt){
            int pivotIndex=findePivotIndex(arr,low,higt)   ;
            quirckSort(arr,low,pivotIndex-1);
            quirckSort(arr,pivotIndex+1,higt);
        }
    }

    private static int findePivotIndex(int[] arr, int low, int higt) {
        int pivot=arr[higt];
        int pivotIndex=low-1;
        for (int i = low; i <higt ; i++) {
            if (arr[i]<=pivot){
                pivotIndex++;
                int tmp=arr[pivotIndex];
                arr[pivotIndex]=arr[i];
                arr[i]=tmp;
            }
        }
        int tmp=arr[pivotIndex+1];
        arr[pivotIndex+1]=arr[higt];
        arr[higt]=tmp;
        return pivotIndex+1;
    }
}