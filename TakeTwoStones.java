import java.util.*;

public class TakeTwoStones {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int numOfStones = scanner.nextInt();
		
		if (numOfStones % 2 == 0) {
			System.out.println("Bob");
		}
		else {
			System.out.println("Alice");
		}
	}

}
