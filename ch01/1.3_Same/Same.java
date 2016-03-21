import java.util.*;

public class Same {

    //Solution 1
    public String sort(String s) {
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }

    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if (stringA.length() != stringB.length()){
            return false;
        }
        return sort(stringA).equals(sort(stringB));
    }

    //Solution 2
    public boolean checkSam2(String s, String t) {
        // write your code here
        int[] hash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if ((--hash[t.charAt(i)]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Same s = new Same();
        System.out.println(s.checkSam("This is nowcoder","is This nowcoder"));
        System.out.println(s.checkSam2("This is nowcoder","is This nowcoder"));
    }
}