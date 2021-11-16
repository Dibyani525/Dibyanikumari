public class LogicalOperators {
	public static void main (String args[]) { 
		
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1);
		}else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
		
		int num4 = 10;
		if(!(num4==10)) {
			System.out.println("Hello");
		}else {
			System.out.println("Welcome");
		}
	}
}
