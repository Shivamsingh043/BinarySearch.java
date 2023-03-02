public class DuplicateNumber {
    public static void main(String[] args){
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            int count = 0;
            for (int j = 0; j <= arr.length-1; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
                if (count == 2){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
