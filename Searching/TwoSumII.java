package Searching;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/857956982/
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target){
        int start = 0;
        int end = numbers.length-1;

        while(start != end){
            int sum = numbers[start] + numbers[end];
            if(sum < target){
                start++;
            }
            else if(sum > target){
                end--;
            }
            else{
                return new int[] {start+1 , end+1};
            }
        }
        return null;
    }
}
