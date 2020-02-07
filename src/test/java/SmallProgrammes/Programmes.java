package SmallProgrammes;

import java.util.Scanner;

public class Programmes {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println(str1);
		
		
		Scanner sc2=new Scanner(System.in);
		String str2=sc.nextLine();
		System.out.println(str2);
//		Scanner sc2=new Scanner(System.in);
//		int n=sc2.nextInt();
//		System.out.println(n);
		
		int j=0,cnt=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				cnt++;
				
			}
			j++;
		}
		System.out.println(cnt);
		
		
	}

}
