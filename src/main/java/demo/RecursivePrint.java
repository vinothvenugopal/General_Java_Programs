package demo;

import java.util.Arrays;

public class RecursivePrint {

	public static void main(String[] args) {

		String str = "abcd";
		recPrint(str);
	}

	static void recPrint(String s)
	{
		while(s.length() > 0)
		{
			System.out.println(s.charAt(0));
			s = s.substring(s.length()-(s.length()-1));
		//	System.out.println(s.length());
			if(s.length()>0)
			{
				recPrint(s);
				break;
			}
		}
	}

}
