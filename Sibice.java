import java.util.*;

public class Sibice {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int matches = scanner.nextInt();
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		double diagonal = Math.sqrt(width*width + height*height);
		
		for (int i = 0; i < matches; i++){
			if (scanner.nextInt() <= diagonal){
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
		
		
	}
}
