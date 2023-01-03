package session_9thoctober_2022;

public class Increment_Operations_Combine {

	public static void main(String[] args) {
		
		int i = 1;//the latest value of i is 1
		int j = i++ + ++i;
		//  i    2      3
		//j   =  1  +  1+2=4
		// the latest value of j is 4 
		int k = ++j + j++;
		//  j = 5      6
		//  k = 1+4 +  5 = 10
		//the latest value of i is 3, j becomes 6, k becomes 10 
		int l = k++ + ++k + k++ + i++;// the latest value of l is
		//  i                      4
		//  k = 11     12    13
		//  l = 10  + 1+11 + 12 + 3 = 37
		
		System.out.println(i);//4
		System.out.println(j);//6
		System.out.println(k);//13
		System.out.println(l);//37

	}

}
