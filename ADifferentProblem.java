import java.util.Scanner;
import java.util.*;

public class ADifferentProblem {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		while (keyboard.hasNextLong()){
			
			long a = keyboard.nextLong();
			long b = keyboard.nextLong();
			
			long answer = Math.abs(a-b);
			System.out.println(answer);
			
		}
		
	}

}
