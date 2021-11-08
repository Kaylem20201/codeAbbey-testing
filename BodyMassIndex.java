import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();

		int weight;
		double height;
		double bmi;
		
		for (int i = 0; i < LENGTH_INPUT; i++) {
			weight = keyboard.nextInt();
			height = keyboard.nextDouble();
			bmi = weight / (Math.pow(height, 2));
			
			if (bmi < 18.5) {
				System.out.print("under ");
			}
			else if (bmi < 25) {
				System.out.print("normal ");
			}
			else if (bmi < 30) {
				System.out.print("over ");
			}
			else {
				System.out.print("obese ");
			}
			
		}
		
		keyboard.close();
	}

}
