public class PrimeNumbers {
	public static void main (String args[]) {
		
		int num = 10;
		int count = 0;
		
		for (int i = 1; i<=num; i=i+1) {
			
			if(num % i ==0) {
				count = count+ 1;
			}
		}
		
		if(count == 2) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime number");
		}
	}
}
