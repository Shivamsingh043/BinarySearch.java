public class Floor_of_number {
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println("The index of the floor element is: ");
        System.out.println(ans);
        System.out.println("The ceiling floor is: ");
        System.out.print(arr[ans]);
    }
    static int floor(int[] arr, int target){
        // floor- greatest number <= target number

        int start = 0;
        int end = arr.length - 1;

        // if there is no any bigger number smaller than the target number
        if( target < arr[start]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end-start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
