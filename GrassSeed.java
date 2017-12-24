import java.text.DecimalFormat;
import java.util.*;

public class GrassSeed {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		double costPerLawn = scanner.nextDouble();
		double numOfLawns = scanner.nextDouble();
		DecimalFormat df = new DecimalFormat("#.000000");
		
		double totalCost = 0;
		
		for (int i = 0; i < numOfLawns; i++){
			double width = scanner.nextDouble();
			double height = scanner.nextDouble();
			double area = width*height;
			
			totalCost += (area * costPerLawn);
			
		}
		
		System.out.println(df.format(totalCost));
		
		
	}

}
