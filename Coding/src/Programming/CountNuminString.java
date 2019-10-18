package Programming;

import java.util.HashMap;

public class CountNuminString {
	
	public static void main(String[] args) {
		
		String countNum = "This This is is a string";
		
		String [] str = countNum.split(" ");
		//int count= str.length;
		//System.out.println(count);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<= str.length-1; i++ ) {
			if(map.containsKey(str[i])) {
				int count= map.get(str[i]);
				map.put(str[i],count+1);
			}
			else {
				
				map.put(str[i], 1);
				
			}
		}
		System.out.println(map);
	}

}
