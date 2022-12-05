import java.lang.annotation.Target;

class linearSearch{
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,9,2,3};
        int ans = search(arr, 8);
        System.out.println("Element at index= "+ans);
    }
    public static int search(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}