import java.util.*;
class typeCasting{  
    public static void main(String args[]){  
     
	int a = 9;
    double b = a; // Automatic casting: int to double
    double c = 9.78d;
    int d = (int) c; // Manual casting: double to int

    System.out.println(a);   // Outputs 9
    System.out.println(b);      // Outputs 9.0
    System.out.println(c);      // Outputs 9.78
    System.out.println(d);   // Outputs 9
	 
    }  
}
