public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = -2;
        int ans = orderAgnosticBs(arr, target);
        System.out.println("the target element is at index number:"+ ans);
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int middle = start + (end-start) / 2;
            if(target == arr[middle]){
                return middle;
            }
            //we check whether the array is in ascending or descending order
            if(isAsc == true){
                if(target > arr[middle]){
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
                }
            else {
                if(target > arr[middle]){
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
