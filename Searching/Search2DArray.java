package Searching;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,5,6,4},
            {25,45,65},
            {25,65}
        };
        int target = 6;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        
    }
    public static int[] search(int[][] arr , int target){
        for(int row = 0; row< arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    // findinga max element in 2D array
    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row=0; row< arr.length; row++){
            for(int col=0; col< arr[row].length; col++){
                int element = arr[row][col];
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
