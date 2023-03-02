public class MinimumInRBS2 {
    public static void main(String[] args){
        int[] nums = {1, 3, 5};
        System.out.println(search(nums));
    }
    static int search(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid-1]){
                return mid;
            }
            if (nums[mid] > nums[mid + 1]){
                return mid+1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                if (start < end && nums[start] > nums[start+1]){
                    return start+1;
                }
                start++;
                if (end > start && nums[end] < nums[end-1]){
                    return nums[end];
                }
                end--;
            }
            else if (nums[start] == nums[mid] || nums[start] < nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
