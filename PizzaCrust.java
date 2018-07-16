import java.util.*;
public class PizzaCrust {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextInt();
		double c = scanner.nextInt();
		
		double answer = (Math.pow((r-c), 2)/ r / r) * 100;
		
		
		System.out.printf("%.6f", answer);

		
	}


}
