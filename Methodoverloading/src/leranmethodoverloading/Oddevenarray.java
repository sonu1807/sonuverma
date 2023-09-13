package leranmethodoverloading;

public class Oddevenarray {
	public static void main(String[] args) {
		
		int arr[]= {6,8,7,4,5,1};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("even elements are:"  +arr[i]);
				
				
			}
			
		}
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(" odd elements are:" + arr[i]);
			}
		}
	}

}
