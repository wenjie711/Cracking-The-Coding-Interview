import java.util.*;

public class Same {
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

    public static void main(String[] args) {
        Same s = new Same();
        System.out.println(s.checkSam("This is nowcoder","is This nowcoder"));
    }
}