package leranmethodoverloading;
//copy elements of one array into another

public class Copyarrayelements {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
		System.out.println("elements of original array: "+arr1[i]);
		arr2[i]=arr1[i];
			
			
		}
		
		System.out.println();
		for(int j=0;j<arr2.length;j++) {
			System.out.println("elements of new array:"+arr2[j]);
			
			
			
		}
	

}
}