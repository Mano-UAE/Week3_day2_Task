package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_Task3 {

	public static void main(String[] args)
	
	{
		/* HAVE DOUBT
		 * String text="We learn java basics as part of java sessions in java week1";
		 * 
		 * char[] A=text.toCharArray();
		 * 
		 * Set<Character> S=new HashSet<Character>();
		 * 
		 * for(Character character : A)
		 * 
		 * { System.out.println(S.add(character)); }
		 */
		
		
		 String text="We learn java basics as part of java sessions in java week1";
		 
		 String nw ="";
		 
		 for (int i=0;i<text.length();i++)
		 {
			char c= text.charAt(i);
			
			if (c!=' ')
			{
				nw=nw+c;
				text=text.replace(c,' ');
			}
		 }
		System.out.println(nw);
		
	}

}
