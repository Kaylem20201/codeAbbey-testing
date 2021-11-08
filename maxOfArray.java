import java.util.Scanner;

public class maxOfArray {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = 300;
		
		final String INPUT = keyboard.nextLine();
		final String[] INPUTS = INPUT.split(" ");
		
		int max = Integer.valueOf(INPUTS[0]);
		int min = Integer.valueOf(INPUTS[0]);
		
		for(String s:INPUTS) {
			max = (max>Integer.valueOf(s)) ? max:Integer.valueOf(s);
			min = (min<Integer.valueOf(s)) ? min:Integer.valueOf(s);
		}
		
		System.out.print(max + " " + min);
		
		keyboard.close();
		
	}

}
