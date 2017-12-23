import java.util.*;

public class Pot {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		
		for (int i = 0; i < count; i++){
			int temp = scanner.nextInt();
			list.add(Math.pow(temp/10, (temp%10)));
		}
	
		int sum = 0;
		for (int j = 0; j < list.size(); j++){
			sum += list.get(j);
		}
		
		System.out.println(sum);
		
		
	}

}
