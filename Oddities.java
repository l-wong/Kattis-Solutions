import java.util.*;

/**
 * If a number n can be expressed as n = 2 * k for some integer k, then n is even.
 * For example 6 = 2 * 3 is even
 * 
 */
public class Oddities {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++){
			int num = scanner.nextInt();
			if (num == ((num/2)*2)){
				System.out.println(num + " is even");
			}
			else {
				System.out.println(num + " is odd");
			}
		}
	}

}
