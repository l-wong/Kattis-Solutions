import java.util.*;

public class Pet {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int best_contestant = 0;
		int total = 0;
		for (int i = 0; i < 5; i++) {
			int current_contestant = scanner.nextInt() + scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
			if (current_contestant > total) {
				best_contestant = i+1;
				total = current_contestant;
			}
		}
		
		System.out.println(best_contestant + " " + total);

	}
}
			

		
		

