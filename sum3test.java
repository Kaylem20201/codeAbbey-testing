import java.util.Scanner;

public class sum3test {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final String lengthInput = keyboard.nextLine();
		
		final int length = Integer.valueOf(lengthInput);
		int operandA, operandB;
		
		for(int i = 0; i < length; i++) {
			operandA = keyboard.nextInt();
			operandB = keyboard.nextInt();
			System.out.print((operandA + operandB) + " ");
		}
		
		keyboard.close();

	}

}
