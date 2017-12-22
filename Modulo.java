import java.util.*;

public class Modulo {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		ArrayList list = new ArrayList();
		
		int count = 0;
		while (count < 10) {
			list.add(scanner.nextInt() % 42);
			count++;
		}
		
		Set uniqueNum = new HashSet(list);
		int length = uniqueNum.size();

		
		System.out.println(length);
	}
		
}
