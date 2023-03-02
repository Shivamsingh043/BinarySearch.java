public class Mountain {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        int ans = PeakIndexMountainArray(arr);
        System.out.println(ans);
    }
    static int PeakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //it means we are in decreasing part of the array
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start; // or return end because in the end start and end will be equal to each other
    }
}
