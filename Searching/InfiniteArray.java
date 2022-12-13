package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int ans = infinitearray(arr, target);
        System.out.println(ans);
    }
    public static int infinitearray(int[] arr , int target){
        int start = 0;
        int end = 1;
        // check condition ki target lie karta hai ki nahi range me
        while(target < arr[end]){
            // hamara new sttart kya ho ha end ka next wala element
            int newstart = end+1;
            // hamara end kyaho ga double the box of size
            // end = previous end + size of the box*2 hpga 
            end = end+(end - start +1)*2;
            start = newstart;
        }
        return binearySearch(arr, target);
    }
    public static int binearySearch(int[]arr , int target){
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
