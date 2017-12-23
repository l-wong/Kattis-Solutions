import java.util.*;

public class NastyHacks {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++){
			int r = scanner.nextInt();
			int e = scanner.nextInt();
			int c = scanner.nextInt();
			
			if ((e-c) > r){
				System.out.println("advertise");
			}
			else if ((e-c) == r){
				System.out.println("does not matter");
			}
			else if ((e-c) < r){
				System.out.println("do not advertise");
			}
		}
	}

}
