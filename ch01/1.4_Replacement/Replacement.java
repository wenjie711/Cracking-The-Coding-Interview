import java.util.*;

public class Replacement {
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

    public static void main(String[] args){
        Replacement r = new Replacement();
        System.out.println(r.replaceSpace("nihao ds d", 10));
    }
}