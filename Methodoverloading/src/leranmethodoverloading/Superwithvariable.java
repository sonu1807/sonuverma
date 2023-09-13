package leranmethodoverloading;
/*use of super with variable*/
public class Superwithvariable {
	int maxspeed=120;
	public static void main(String[] args) {
		 Car small =new Car();
		 small.display();

	}

}
 class Car extends Superwithvariable{
	 int maxsped=180;
	  public void display() {
		 System.out.println("maixmum speed is"+super.maxspeed);
		 
		 
	  }
 }
 
	
 
