package Week3.day2;

public class SumofDigits_Task5 {

	public static void main(String[] args)
	
	{
		String text = "Tes12Le79af65";
		int sum =0;
		char[] C=text.toCharArray();
		
		for(int i=0;i<text.length();i++)
		{
			
			if(Character.isDigit(text.charAt(i)))
			{
				sum=sum+Character.getNumericValue(text.charAt(i));
			}
		}
		System.out.println(sum);

	}

}
