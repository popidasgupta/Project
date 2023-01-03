package session_9thoctober_2022;

public class Increment_Operations {

	public static void main(String[] args) {
		// increment ++
		
		int i =1; //the latest value of i is 1
		int j = i++; // j got some value from i which is 1. Now j is 1, and i has to increment itself, which is 2
		//latest value of j is 2. the latest value of j is 1
		int k = j++; //k is 1, and j is 2, k is 1
		//the latest value is 2, j is 2, k is 1 
		int l = k++; // l is 1, k is 2
		//latest value is 2, j is 2, k is 2, l is 1
		
		
		System.out.println(i);//2
		System.out.println(j);//2
		System.out.println(k);//2
		System.out.println(l);//1
		
		
		System.out.println("*******************************************");
		
		int m = 1; //the latest value of m is 1
		int n = ++m; //the latest value of n is 2, m becomes 2
		int o = ++n;// the latest value of o is 3, n i becomes 3
		int p = ++o;// the latest value of p is 4, o becomes 4
		
		
		System.out.println(m);//2
		System.out.println(n);//3
		System.out.println(o);//4
		System.out.println(p);//4
		
		
		
		
		
		
		
	}

}
