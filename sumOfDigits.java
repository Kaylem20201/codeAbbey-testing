import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();
		keyboard.nextLine();
		
		int res = 0;
		int sum = 0;
		
		for (int i = 0; i < LENGTH_INPUT; i++) {
			
			res = (keyboard.nextInt() * keyboard.nextInt()) + keyboard.nextInt();
			while((res/10) >0) {
				sum += res%10;
				res /= 10;
			}
			sum += res%10;
			
			System.out.print(sum + " ");
			sum = 0;
			
		}
		
		
		keyboard.close();
		
		
	}

}
