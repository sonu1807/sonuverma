package leranmethodoverloading;
//learning method overloading
public class Methodoverloading {
//changing the number of arguments	
	static int add(int a,int b,int c) {
		return a+b+c;
		
			}
	static int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		System.out.println(Methodoverloading.add(11,11,11));
		System.out.println(Methodoverloading.add(11,11));
		
	}
	

}
