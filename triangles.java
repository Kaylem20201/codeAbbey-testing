import java.util.Scanner;

public class triangles {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int lengthInput = keyboard.nextInt();
		
		int a, b, c, temp;
		int res;
		
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
			
			if((a+b) <= c) {
				System.out.print(0 + " ");
			}
			else {
				System.out.print(1 + " ");
			}
			
			
		}
		
		keyboard.close();
	}

}
