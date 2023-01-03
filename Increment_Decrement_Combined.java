package session_9thoctober_2022;

public class Increment_Decrement_Combined {

	public static void main(String[] args) {
		
		int i = 1;//i value is 1
		int j = ++i - --i;
		//  i = 2       1
		//  j = 1+1 - 1 = 1
		// the latest value of i is 1 and j is 1
		
		System.out.println(i);
		System.out.println(j);
		
		int k = j-- - --i + i-- - --j;
		//  k 
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		
		
		System.out.println(k);
		System.out.println(l);
		
		

	}

}
