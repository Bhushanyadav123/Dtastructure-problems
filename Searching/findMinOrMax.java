package Searching;

public class findMinOrMax {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,0,9,14,56,85,95};
        System.out.println("The Minimum number of array is ="+ minimum(arr));
        System.out.println("The Maximum Number of array is ="+ maximum(arr));
    }  
    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        return max;
    }
}
