import java.util.*;

public class Tarifa {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int dataLimit = scanner.nextInt();
		int numMonths = scanner.nextInt();	
		
		int dataLeft = 0;
		
		for (int i = 0; i < numMonths; i++){
			
			if (scanner.hasNextInt()) {
				dataLeft += (dataLimit - scanner.nextInt());
			}
		}
		dataLeft += dataLimit;
		System.out.println(dataLeft);

	}
	

}
