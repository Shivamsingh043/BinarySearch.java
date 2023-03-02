public class DoubleTheNumber {
    public static void main(String[] args){
        int[] arr = {7, 1, 14, 11};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr){
        for(int i = 0; i <= arr.length-1; i++){
            for(int j = 0; j <= arr.length-1; j++){
                if (arr[i] == arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }
}
