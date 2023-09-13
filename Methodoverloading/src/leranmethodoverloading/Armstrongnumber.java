package leranmethodoverloading;
import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int sum=0;
		
		
		System.out.println("enter the number to check for armstrong:");
		int num=s1.nextInt();
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			num/=10;
			sum=sum+(rem*rem*rem);
			}
		if(  temp==sum) {
			System.out.println("the number is armstrong");
			
		}
		else {
			System.out.println("the number is not armstrong");
		}
		
		
		
		
	}

}
