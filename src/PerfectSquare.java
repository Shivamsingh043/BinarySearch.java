public class PerfectSquare {
    public static void main(String[] args){
        int num = 14;
        System.out.println(isPerfect(num));
    }
    static boolean isPerfect(int num){
        int start = 0;
        int end = num;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(num == (mid * mid)){
                return true;
            }
            else if (num > (mid * mid)){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
