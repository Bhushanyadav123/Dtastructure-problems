package Searching;

public class BinearySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,8,12,17,20,25,32,56,89};
        int target = 4;
        int ans = search(arr, target);
        System.out.println("the element at index ="+ ans);
    }
    public static int search(int[] arr , int target){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
