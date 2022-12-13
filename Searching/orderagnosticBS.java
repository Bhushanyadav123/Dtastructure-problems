package Searching;

public class orderagnosticBS {
    public static void main(String[] args) {
        int[] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = orderognesticBS(arr, target);
        System.out.println(ans);
    }
    public static int orderognesticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        
        // check whether if we don't know the array is sorted in acsending order or desending order
        boolean isAcending = arr[start] < arr[end];

        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAcending){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }

}
