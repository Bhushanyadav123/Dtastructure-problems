package Searching;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/856485388/
public class mountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("the peak of element are = "+ ans);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start+(end-start)/2;
            // hamara array acending aur decending dono hai 
            // first hum mid nikalenge phir check karenge ki hamara mid kaha lie karta hai  
            if(arr[mid] > arr[mid+1]){
                // ho sakta hai hamara mid hi nams ho toh mid ko ans manke aage check kerenge kyu ki 
                // ho sakta hai hamara peak element mid se aage ho kyu ki mid +1 hai isliye  
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
