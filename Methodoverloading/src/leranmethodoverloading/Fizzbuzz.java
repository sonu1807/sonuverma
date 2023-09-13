package leranmethodoverloading;
import java.util.Scanner;

public class Fizzbuzz {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the number");
		int num=s1.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%3==0) {
				System.out.println("fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			else if(i%3==0&& i%5==0) {
				System.out.println("fizzbuzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
		
	}

}
