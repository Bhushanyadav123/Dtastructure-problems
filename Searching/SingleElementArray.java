package Searching;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate( arr));
    }
    public static int singleNonDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;

        if(arr.length == 1){
            return arr[0];
        }
        if(arr[start] != arr[start+1]){
            return arr[start];
        }
        if(arr[end] != arr[end-1]){
            return arr[end];
        }
 
        while(start <= end){
            int mid = start+(end-start)/2;
            //case1 agar mid hamara mid+1 !=mid or mid-1 != mid hai toh hum mid retrn kardenge
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            // case2 and case3 if hamara mid = mid+1 and mid even hai or mid == mid-1 and mid odd hai toh 
            // right side me toh element na hi present hoga 
            else if((arr[mid] == arr[mid+1] && mid % 2 == 0)||(arr[mid] == arr[mid-1] && mid % 2 !=0)){
                start = mid+1;
            }
            // toh hum left me check karenge 
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
