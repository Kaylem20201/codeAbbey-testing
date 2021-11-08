import java.util.Scanner;

public class vowelCount {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		final int LENGTH_INPUT = keyboard.nextInt();
		keyboard.nextLine();
		
		String temp;
		int count;
		
		for(int i = 0; i < LENGTH_INPUT; i++) {
			
			count = 0;
			
			temp = keyboard.nextLine();
			for(int j = 0; j<temp.length(); j++) {
				switch (temp.charAt(j)) {
					case 'a' :
					case 'e' :
					case 'i' :
					case 'o' :
					case 'u' :
					case 'y' :
						count++;
						break;
				}
			}
			
			System.out.print(count + " ");
			
			
		}
		
		keyboard.close();
		
	}

}
