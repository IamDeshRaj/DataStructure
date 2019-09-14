package com.data.structure.string;

public class GenerateAllCombinations {

	public static void main(String[] args) {
		String s = "ABC";
		permuntation(s, 0, s.length()-1);
	}
	
	/*private static void permuntation(String str, int l, int r) { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permuntation(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }*/

	private static void permuntation(String s, int l, int r) {
		if(l==r) {
			System.out.println("s="+s);
			return;
		}else {
			for (int i = l; i <= r; i++) {
				s = swap(s, l, i);
				if(!s.contains("AB")) {
					permuntation(s, l+1, r);
				}
				s = swap(s, l, i);
			}
		}
	}

	private static String swap(String s, int k, int i) {
		char[] chars = s.toCharArray();
		char tmp = chars[k];
		chars[k] = chars[i];
		chars[i] = tmp;
		return String.copyValueOf(chars);
	}
}
