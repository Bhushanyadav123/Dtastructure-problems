package Searching;

public class FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,7,7,7,8,9};
        int target = 7;
        int ans = firstOccurance(arr, target);
        System.out.println("The fiestoccurance of element is = "+ans);
        int ans1 = lastOccurance(arr, target);
        System.out.println("the lastOccurance of element is "+ ans1);
    }
    public static int firstOccurance(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                ans = mid;
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target == arr[mid]){
                ans = mid;
                start = mid+1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
