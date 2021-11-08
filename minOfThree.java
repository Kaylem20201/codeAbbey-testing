import java.util.Scanner;

public class minOfThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int lengthInput = keyboard.nextInt();
		
		int temp, next;
		
		for (int i = 0; i < lengthInput; i++) {
			temp = keyboard.nextInt();
			next = keyboard.nextInt();
			temp = (temp<next) ? temp:next;
			next = keyboard.nextInt();
			temp = (temp<next) ? temp:next;
			System.out.print(temp + " ");
		}
		
		keyboard.close();
	}

}
