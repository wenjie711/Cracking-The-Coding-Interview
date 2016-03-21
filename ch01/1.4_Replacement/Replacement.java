import java.util.*;

public class Replacement {
    // http://www.nowcoder.com/
    public String replaceSpace(String iniString, int length) {
        // write code here
        int cnt = 0;
        for (int i = 0; i < length; i++){
            if(iniString.charAt(i) == ' '){
                ++cnt;
            }
        }
        char[] c = new char[length + cnt * 2];
        for (int i = 0, j = 0; i < length; ++i, ++j){
            if (iniString.charAt(i) != ' '){
                c[j] = iniString.charAt(i);
            }else{
                c[j++] = '%';
                c[j++] = '2';
                c[j] = '0';
            }
        }
        return new String(c);
    }

    // http://www.lintcode.com/zh-cn/problem/space-replacement/
    public int replaceBlank(char[] string, int length) {
        // Write your code here
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                ++cnt;
            }
        }
        int newLen = length + cnt * 2 - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[newLen--] = '0';
                string[newLen--] = '2';
                string[newLen--] = '%';
            } else {
                string[newLen--] = string[i];
            }
        }
        return length + cnt * 2;
    }

    public static void main(String[] args){
        Replacement r = new Replacement();
        System.out.println(r.replaceSpace("nihao ds d", 10));

        char[] t = new char[100];
        t[0] = 'n';
        t[1] = 'i';
        t[2] = 'h';
        t[3] = 'a';
        t[4] = ' ';
        t[5] = 'd';
        t[6] = 's';
        t[7] = ' ';
        t[8] = 'd';
        System.out.println(r.replaceBlank(t, 10));
        System.out.println(new String(t));
    }
}