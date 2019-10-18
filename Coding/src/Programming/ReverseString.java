package Programming;

public class ReverseString {
	
	//Write a Java Program to reverse a string without using String inbuilt function.
	
	public static void main(String[] args) {
		
		reverseWithStringfunction();
		ReverseWithoutUsingInbuiltFunction();
	}
	
	public static void reverseWithStringfunction() {
		

		String name="Abhijeet";
		
		StringBuilder nameRev = new StringBuilder(name);
		System.out.println(nameRev.reverse());
		
	}
	
	public static void ReverseWithoutUsingInbuiltFunction() {
		
		String newname = "abcde";
		
		char revName[] = newname.toCharArray();
		
		//print in reverse order
		System.out.println(revName.length);
		
		for(int i = revName.length-1; i >=0 ; i--) {
			
			System.out.print(revName[i]);
		}
		
	}

}
