import java.util.Scanner;

public class rounding {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();
		
		double operandA, operandB;
		double temp;
		
		for(int i = 0; i<LENGTH_INPUT; i++) {
			operandA = keyboard.nextInt();
			operandB = keyboard.nextInt();
			temp = (operandA/operandB);
			temp += (temp >0) ? .5 : -.5;
			System.out.print((int)temp + " ");
		}
		
		keyboard.close();
		
	}
}
