package leranmethodoverloading;
import java.util.Scanner;


public class Largestof3 {
	public static void main(String[] args) {
		
	
	Scanner s1=new Scanner(System.in);
	
	
	System.out.println("enter the first number");
	int a=s1.nextInt();
	
	System.out.println("enter the second number");
	int b=s1.nextInt();
	
	System.out.println("enter the third number");
	int c=s1.nextInt();
	
	if(a>b&&a>c) {
		System.out.println("first number is greatest");
	}
	
	if(b>a&&b>c) {
		System.out.println("second number is greatest");
	}
	
	if(c>a&&c>b) {
		System.out.println("third number is greatest");
	}
	
	}
	
}