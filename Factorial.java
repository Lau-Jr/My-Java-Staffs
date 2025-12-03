import java.util.Scanner;

class Factorial {
		
	public static long calculateFactorial(long number){
		
		long factorial = 1;
		
		if(number == 0){
			
			return factorial;
			
			}
		while(number > 1){
			
			factorial = factorial * number;
			number --;
			
			}	
		return factorial;
		}
		
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.printf("%n Number: ");
			long number = input.nextLong();
			
			System.out.printf("factorial of %d is %d",number,calculateFactorial(number));
			
			}
}
