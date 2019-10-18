package Programming;

public class primeNumber {

	public static void main(String[] args) {
		
		int num = 33;
		boolean isPrime = true;
		
		for(int i=2; i<= num/2; i++) {
			
		int temp = num%i;
		if(temp == 0) {
			isPrime = false;
			break;
			}
		
		}
	
		if(isPrime) {
			System.out.println(num +" : Is a prime Num");
		}
		else {
			System.out.println(num + " : is not a prime num");
		}
	}
}
