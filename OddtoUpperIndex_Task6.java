package Week3.day2;

public class OddtoUpperIndex_Task6 {

	public static void main(String[] args)
	
	{
		 String test = "changeme";
		 
		 char[] c= test.toCharArray();
		 
		 for(int i=0;i<test.length();i++)
		 {
			 if(i%2 !=0)
			 {
				 System.out.print( " " + c[i]);
			 }
		 }

	}

}
