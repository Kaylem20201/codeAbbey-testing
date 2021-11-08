import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();
		keyboard.nextLine();
		
		int start, step, count;
		int sum = 0;
		
		for (int i = 0; i < LENGTH_INPUT; i++) {
			start = keyboard.nextInt();
			step = keyboard.nextInt();
			count = keyboard.nextInt();
			for(int j = 0; j < count; j++) {
				sum += start + (step*j);
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		
		
		keyboard.close();
		
		
	}

}
