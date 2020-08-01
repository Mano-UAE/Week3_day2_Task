package Week3.day2;

public class CharOccurence_Task1 {

	public static void main(String[] args) {
		
		/* have doubt
		 * String str="welcome to chennai";
		 * 
		 * int count =0;
		 * 
		 * char[] Str1 = str.toCharArray(); int length = str.length(); for(int
		 * i=0;i<str.length();i++) { if( == 'c') {
		 * 
		 * str ++; } } System.out.println("Char occurence of c is " + count); }
		 * 
		 * }
		 */
		 
		String str = "welcome to chennai";
		
		int length = str.length();  //total length
		
		int Afterremovallength =str.replace("e","").length(); //after removal
		
		int count = length - Afterremovallength;
		
		System.out.println("Char occurence of e is " + count );
		
		

	}
}
