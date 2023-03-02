public class FindInMountain {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch2(array, 3));
    }
    static int findPeakElement(int[] array){
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] > array[mid-1]){
                // it means we are in ascending part of the array
                start = mid + 1;
            }
            if (array[mid] < array[mid-1]){
                // it means we are in descending part of the array
                end = mid;
            }
            return start;
        }
     return -1;
    }
    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = findPeakElement(array);
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] == target){
                return mid;
            }
            if (array[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch2(int[] array, int target){
        int start = findPeakElement(array)+1;
        int end = array.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (array[mid] == target){
                return mid;
            }
            if (array[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
