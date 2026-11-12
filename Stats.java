import java.util.Arrays;
public class Stats{
	public static void main(String[] args){
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< args.length; i++){
			sum += Integer.parseInt(args[i]);
			int value = Integer.parseInt(args[i]);
			if(value>max){
				max = value;
			}
			if(value<min){
				min = value;
			}
			
			
			
		}
		double average = sum/args.length;
		System.out.println("Count: " + args.length);
		System.out.println("Sum: " + sum);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + average);
	
	}


}
