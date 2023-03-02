public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println("The target element is at index number:"+ ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int middle = start + (end-start) / 2;
            if(target == arr[middle]){
                return middle;
            }
                if(target > arr[middle]){
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        return -1;
    }
}
