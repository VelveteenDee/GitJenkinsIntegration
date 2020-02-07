package SmallProgrammes;

import java.util.Scanner;

public class SearchRepeatedchara {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		
		for(int i=0;i<str1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					cnt++;

				}

				
			}
			System.out.println(str1.charAt(i)+" "+cnt);

		}
		
	
		
	}

}
