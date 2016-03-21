import java.lang.System;
import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {
        // write code here
    	int[] a = new int[8];
    	int length = iniString.length();
    	for(int i = 0; i < length; i++){
			char t = iniString.charAt(i);
			int idx = t / 32;
			int shift = t % 32;
			if( (a[idx] & (1 << shift)) != 0) {
				return false;
			}else {
				a[idx] = a[idx] | (1 << shift);
			}
    	}
		return true;
    }

    public static void main(String[] args){
		Different d = new Different();
		System.out.println(d.checkDifferent("acbdbesy"));
    	return;
    }
}