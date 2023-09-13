package leranmethodoverloading;

public class Duplicateelements {
	public static void main(String[] args) {
		
		int a[]= {3,6,8,5,5,8,3};
		
		for(int i=0;i<a.length;i++) {
	for(int j =i+1;j<a.length;j++){
		if(a[i]==a[j]) {
			System.out.println("duplicate elements are:"   +a[j]);
		}
		
		
	}
		}
		
		
		
	}

}
