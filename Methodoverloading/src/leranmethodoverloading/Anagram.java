package leranmethodoverloading;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		
		
		
		if(c1.length==c2.length) {
	
			
Arrays.sort(c1);
Arrays.sort(c2);
			
		}
		
		
		
			if(Arrays.equals(c1, c2)) {
	
			
				System.out.println("strings are  anagrams");
				
				
			}
		
		
				
			
			else {
				System.out.println("strings are not anagrams");
			}
		}
		
}


