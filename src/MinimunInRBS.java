public class MinimunInRBS {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(MinimumElement(nums));
    }
    static int MinimumElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if (nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            if (nums[0] < nums[mid]){
                start = mid + 1;
            }
            if (end > nums[mid]){
                end = mid;
            }
        }
        return -1;
    }
}
