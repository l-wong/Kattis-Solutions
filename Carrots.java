import java.util.*;

public class Carrots {

	public static void main (String[] args){
		
		Scanner scanner = new Scanner (System.in);
		int contestants = scanner.nextInt();
		int solvedProblems = scanner.nextInt();
		int carrots = solvedProblems;
		ArrayList contestantNames = new ArrayList();
		
		
		for (int i = 0; i < contestants + 1; i++){
			contestantNames.add(scanner.nextLine());
		}
	System.out.println(carrots);
	}
}
