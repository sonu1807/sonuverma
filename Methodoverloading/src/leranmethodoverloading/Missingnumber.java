package leranmethodoverloading;

public class Missingnumber {
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			sum1+=a[i];
			
		}
		System.out.println("sum of array elements is:"  +sum1);
		
	


int sum2=0;
for(int i=0;i<=5;i++) {
	sum2+=i;
}
System.out.println("sum of array elements is:"           +sum2);
System.out.println("missing number is:"+(sum2-sum1));

}
	
}