import java.util.*;

public class Faktor {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int articles = scanner.nextInt();
		int impactF = scanner.nextInt();
		
		int test = articles * (impactF - 1) + 1;
		
		System.out.println(test);
		
	}

}
