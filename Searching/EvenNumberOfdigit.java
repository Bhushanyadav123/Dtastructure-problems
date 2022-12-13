package Searching;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberOfdigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int num){
        int digitOfnumber = digit(num);
        // if(digitOfNumber % 2 == 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return digitOfnumber % 2 == 0;
    }
    public static int digit(int num){
        if(num < 0){
            num = num*-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num >0){
            count++;
            num =num/10;
        }
        return count;
    }
}
