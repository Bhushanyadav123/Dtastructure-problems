package Searching;

public class SearchinRange {
   public static void main(String[] args) {
    int[] arr = {56,89,4,5,75,65,23,21};
    int target = 5;
    int ans = search(arr, target, 1, 4);
    System.out.println("the element at index = "+ ans);
   }
   public static int search(int[] arr , int target, int start, int end){
    // if array is empty
    if(arr.length == 0){
        return -1;
    }
    // run a for loop
    for(int index=start ; index <= end; index++){
        // check the element in every index if it is = terget
        int element = arr[index];
        if(element == target){
            return index; 
        }
    }
    // this will execute if none of the return statement above have executed
    return -1;
   }
}
