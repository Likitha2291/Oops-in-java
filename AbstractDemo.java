package mypackage;


	 abstract class Atm {
	 abstract void withdraw();
	 abstract void deposite();
	}
	public class AbstractDemo extends Atm {
	  void withdraw()
	  {
		  System.out.println("withdraw");
	  }
	  void deposite()
	  {
		  System.out.println("deposite");
	  }
		public static void main(String[] args) {
			AbstractDemo ff = new AbstractDemo();
			ff.withdraw();
			ff.deposite();
   }
}


	
		

	