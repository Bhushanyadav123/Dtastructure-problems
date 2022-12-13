package Searching;



public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,8,6,3,4,9};
        int ans = Search(arr, 6);
        System.out.println("the element at index= "+ ans);
    }
    public static  int Search(int[] arr , int target){
        // if the arr is empty
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // if element are not found
        return -1;
    }
}
