import java.io.ObjectInputStream.GetField;

public class EncapsulationDemo {

	
	private String name;
	private int age;
	
	public String getName() {
		
		return name;
	
	}
	
	public int getAge() {
	
	return age;
	
	}
	
	public void setName(String setname) {
		
		name = setname;
	}
	
	public void setAge(int setage) {
		
		age = setage;
		
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo en = new EncapsulationDemo();
		en.setAge(38);
		en.setName("Abhijeet");
		
		System.out.println("Age : " + en.getAge());
		System.out.println("Name : "+ en.getName());
		
		
	}
}
