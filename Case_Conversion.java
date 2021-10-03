/*
	input  :AbCd
	output :aBcD
*/
import java.util.*;
class Case_Conversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		//String k,j;
		String Resultant_string="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				
				Resultant_string=Resultant_string+ Character.toLowerCase(str.toCharArray()[i]);
			}
			else
			{
				Resultant_string=Resultant_string+ Character.toUpperCase(str.toCharArray()[i]);
			}
		}
		System.out.println(Resultant_string);
		
	}
}