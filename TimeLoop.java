import java.util.*;

public class TimeLoop {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int magicNumber = scanner.nextInt();
		
		for (int i = 1; i <= magicNumber; i++){
			System.out.println(i + " Abracadabra");
		}
		
	}
}
