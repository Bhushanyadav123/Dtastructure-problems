package Searching;
 //https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,2,1}
        };
        int ans = maximumWealth(arr);
        System.out.println("the maximum wealth is = "+ ans);
    }
    public static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for(int person=0 ; person < accounts.length; person++){
            int sum = 0;
            for(int account=0; account<accounts[person].length; account++){
                sum += accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
