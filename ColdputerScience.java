import java.util.*;

public class ColdputerScience {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int total = 0;
		
		for (int i = 0; i < count; i++){
			int degree = scanner.nextInt();
			if (degree < 0){
				total++;
			}
			else {
				total += 0;
			}
		}
		System.out.println(total);
	}

}
