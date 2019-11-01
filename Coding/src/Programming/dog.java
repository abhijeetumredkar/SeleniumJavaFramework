package Programming;

public class dog {

	interface Pet{
		  public void test();
		}
		static class Dog implements Pet{
		   public void test(){
		     System.out.println("Interface Method Implemented");
		  }
		   public static void main(String args[]){
		     Pet p = new Dog();
		     p.test();
		  }
		}
	
}
