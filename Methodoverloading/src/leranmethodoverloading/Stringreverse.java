package leranmethodoverloading;

public class Stringreverse {
	public static void main(String[] args){
		
		String s1="sonu";
	
		String rev="";
		
		int len=s1.length();
		
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
			
		}
		System.out.println("reversed string is:"  +rev);
		
		
	}

}
