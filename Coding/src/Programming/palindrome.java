package Programming;

public class palindrome {
	
	public static void main(String[] args) {
		
		//String value = "1111";
		int value = 1111;
		String newvalue = Integer.toString(value);
		StringBuilder str = new StringBuilder(newvalue);
		String reverse = str.reverse().toString();
	
		if (newvalue.equals(reverse)) {
			
			System.out.println("Is a Palindrome");
			
		}else {
			
			System.out.println("Is not a Palindrome");
		}
		
	}

}
