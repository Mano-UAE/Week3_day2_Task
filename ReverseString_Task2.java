package Week3.day2;

public class ReverseString_Task2 {

	public static void main(String[] args)
	
	{
		String test = "feeling good";
		
		int length = test.length();
		
		for(int i=test.length()-1;i>=0;i--)
		{
			System.out.print(test.charAt(i));
		}

	}

}
