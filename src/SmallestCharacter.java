import java.util.Arrays;

public class SmallestCharacter {
    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char ans = smallestCharacter(letters, target);
        System.out.println(ans);
    }
     static public char smallestCharacter(char[] letters, char target){
        int start = 0;
        int end = letters.length;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
