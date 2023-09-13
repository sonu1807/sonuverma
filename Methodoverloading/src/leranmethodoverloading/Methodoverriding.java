package leranmethodoverloading;
//learning method overriding
public class Methodoverriding {
	void run() {
		System.out.println("system is running");
		
	}
	public static class Methodoverriding2 extends Methodoverriding{
		void run() {
			System.out.println("laptop is running successfully");
		}
		public static void main(String[] args) {
			Methodoverriding2 obj=new Methodoverriding2();
			obj.run();
		
		}
	}

}
