package Week3.day2;

import java.util.Scanner;

public class Palindrome_Task4 {

	public static void main(String[] args) 
	
	{
		String S1="madam r";
		String S2="";
	
		for(int i=S1.length()-1;i>=0;i--)
		{
			System.out.print(S1.charAt(i));
			S2= S2+ S1.charAt(i);
		}
		if(S1.equals(S2))
		{
			System.out.print("String is a Palindrome ");
		}
		else 
		{
			System.out.println("String is a not Palindrome ");
		}
	}
}
