package Searching;

public class bookAllocation {
    public static void main(String[] args) {
        int[]A = {12,34,67,90};
       System.out.println(findPages(A, 4, 2));
    }
    public static int findPages(int[]A,int N, int M){
        int s =0;
        int sum = 0;
        for(int i=0; i<=N-1; i++){
            sum +=A[i];
        }
        int e =sum;
        int ans = -1;
        int mid = s+(e-s)/2;
        while(s<=e){
            if(isPossible(A , N , M , mid)){
                ans = mid;
                e = mid-1;
            }
            else{
                s =mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    static boolean isPossible(int[]A,int N,int M , int mid){
        int studentCount  =1; 
       int pageSum =0;
        for(int i=0; i<=N-1; i++){
            if(pageSum +A[i] <=mid){
                pageSum +=A[i];
            }
            else{
                studentCount++;
                if(studentCount > M || A[i] >mid){
                    return false;
                }
                pageSum = A[i];
            }
        }
        return true;
    }
}
