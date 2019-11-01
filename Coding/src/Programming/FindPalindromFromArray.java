package Programming;

public class FindPalindromFromArray {

	public static void main(String[] args) {
		String reverse = null;
		String newString = null;
		int[] num = new int[3];
		num[0]=10;
		num[1]=11;
		num[2]=12;
		
		for(int i=0; i<3 ; i++) {
			
			newString = Integer.toString(num[i]);
			StringBuilder str = new StringBuilder(newString);
			reverse= str.reverse().toString();
			if(newString.equals(reverse)) {
				System.out.println("Num is reverse");
				
			}else {
				System.out.println("Num not reverse");
			}
		}
		
		
		
	}
	
}
