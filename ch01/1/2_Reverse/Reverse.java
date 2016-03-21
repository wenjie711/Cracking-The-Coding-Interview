import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        // write code here
        int length = iniString.length();
        char[] c = iniString.toCharArray();
        for (int i = 0; i < length / 2; i++){
            char t = c[i];
            c[i] = c[length - i - 1];
            c[length - i - 1] = t;
        }
        return new String(c);
    }

    public static void main(String[] args){
        Reverse r = new Reverse();
        System.out.println(r.reverseString("ni hao a"));
    }
}