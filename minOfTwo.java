import java.util.Scanner;

public class minOfTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int lengthInput = keyboard.nextInt();
		
		int operandA, operandB;
		
		for (int i = 0; i < lengthInput; i++) {
			operandA = keyboard.nextInt();
			operandB = keyboard.nextInt();
			System.out.print((operandA < operandB) ? operandA:operandB);
			System.out.print(" ");
		}
		
		keyboard.close();
	}

}
