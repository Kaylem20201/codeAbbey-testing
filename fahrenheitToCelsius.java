import java.util.Scanner;

public class fahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();
		final double CONVERT = 5.0/9.0;
		
		int f;
		double c;
		
		for(int i = 0; i < LENGTH_INPUT; i++) {
			f = keyboard.nextInt();
			c = (double)(f-32) * CONVERT;
			System.out.print(Math.round(c) + " ");
		}
		
		keyboard.close();
		
	}

}
