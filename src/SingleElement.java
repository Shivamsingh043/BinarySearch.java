public class SingleElement {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            boolean isEven = ((end - mid) % 2 == 0);
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if (nums[mid] == nums[mid-1]){
                if (isEven){
                    end = mid - 2;
                }
                else {
                    start = mid + 1;
                }
            }
            if (nums[mid] == nums[mid+1]){
                if (isEven){
                    start = mid + 2;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
