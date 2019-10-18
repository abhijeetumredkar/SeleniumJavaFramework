
public class Polymorphism {

	// Diff entity with the same name. this is done with the help of declaration 
	// 2 types of polymorphism 
	//Overloading/ Over riding 
	
	//Below is the example of Overloading for meathod pilymorphism
	// meathod name is same ex sum, but parameters are different 
	
	public int sum(int x, int y) {
		
		return (x+y);
		
	}
	
	public int sum(int x, int y, int z) {
		
		return(x+y+z);
		
	}
	
	public double sum(Double x, Double y) {
		
		return(x+y);
		
	}
	
	public static void main(String[] args) {
		
		Polymorphism s = new Polymorphism();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
		
		
	}
	
}
