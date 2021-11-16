import java.util.*;
public class Operators {
	
	public static void main (String args[]) { 
		
		System.out.println(100==100); // true
		System.out.println(100==1); // false
		System.out.println(10==1000); //false
		
		System.out.println(10>1000); //false
		System.out.println(1000>1000); //false
		System.out.println(10110 > 1000); //true
		
		System.out.println(10 < 1000); //true
		System.out.println(1000 < 1000); //false
		System.out.println(10110 < 1000); //false
		
		System.out.println(10>=1000); //false
		System.out.println(1000>=1000); //true
		System.out.println(10110 >= 1000); //true
		
		System.out.println(10 <= 1000); //true
		System.out.println(1000 <= 1000); //true
		System.out.println(10110 <= 1000); //false
		
		System.out.println(10 != 1000); //true
		System.out.println(1000 != 1000); //false
		System.out.println(10110 != 1000); //true
		
	}
