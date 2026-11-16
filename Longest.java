public class Longest{
	
	public static String largest(String[] words){
		int a = 0;
		for(int i = 1; i<words.length; i++){
			if(words[i].length()>words[a].length()){
				a = i;
			}
			
			
		}
		return words[a];
		
	}
	public static String alphabet(String[] args){
		int a = 0;
		for(int i = 0; i < args.length; i++){
			int diff = args[i].compareTo(args[a]);
			if(diff<0){
				a=i;
			}
			
		}
		return args[a];
	}
	public static void main(String[] args){
		System.out.println("Longest: " + largest(args) + " (" + largest(args).length() + " letters)");
		System.out.println("First alphabetically: " + alphabet(args));
	
	
	
	}


}
