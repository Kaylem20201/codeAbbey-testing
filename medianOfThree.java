import java.util.Scanner;

public class medianOfThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int lengthInput = keyboard.nextInt();
		
		int a, b, c, temp;
		
		for (int i = 0; i < lengthInput; i++) {
			a = keyboard.nextInt();
			b = keyboard.nextInt();
			c = keyboard.nextInt();
			if (a > b) {
				temp = b;
				b = a;
				a = temp;
			}
			if (b > c) {
				temp = c;
				c = b;
				b = temp;
			}
			if (a > b) {
				temp = b;
				b = a;
				a = temp;
			}
			System.out.print(b + " ");
		}
		
		keyboard.close();
	}

}
