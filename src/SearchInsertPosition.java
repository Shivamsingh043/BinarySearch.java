public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(insert(nums, target));
    }
    static int insert(int[] nums, int target){
        int insert = 0;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                insert = mid;
                end = mid - 1;
            }
            if (nums[mid] < target){
                insert = mid + 1;
                start = mid + 1;
            }
        }
        return insert;
    }
}
