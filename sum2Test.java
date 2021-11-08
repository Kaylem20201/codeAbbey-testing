import java.util.Scanner;

public class sum2Test {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final String lengthInput = keyboard.nextLine();
		final String input = keyboard.nextLine();
		
		final int length = Integer.valueOf(lengthInput);
		final String[] inputs = input.split(" ");
		
		int sum = 0;
		
		for(String i : inputs) {
			sum += Integer.valueOf(i);
		}
		
		System.out.print(sum);
		keyboard.close();

	}

}
