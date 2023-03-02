public class RotatedBS {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans1 = findPivot(nums);
        System.out.println("the pivot element is at index number:" +ans1);
        int ans2 = search(nums, target);
        System.out.println("The target element is at index number:" +ans2);
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(  nums);
        if (pivot == -1){
            return binarySearch(  nums, target, 0,nums.length - 1);
        }
        if (target ==   nums[pivot]){
            return pivot;
        }
        if (target >=   nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

            return binarySearch(nums, target, pivot + 1,   nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            }
            else if(target >  arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int findPivot(int[]  arr){
        int start = 0;
        int end =  arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end &&  arr[mid] >  arr[mid + 1]){
                return mid;
            }
            if (mid > start &&  arr[mid] <  arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
