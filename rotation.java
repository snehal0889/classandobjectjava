package string;
import java.util.*;
public class rotation
{

	public static void main(String[] args) 
	{
		Scanner xy=new Scanner(System.in);
		System.out.println("enter the name");
		String str=xy.next();
		char ch[]=str.toCharArray();
		int len=str.length();
		int i,j;
		System.out.println("enter the rotation");
		int no=xy.nextInt();
		for(j=1;j<=no;j++)
		{
			char temp=ch[0];
			for(i=0;i<len-1;i++)
			{
				ch[i]=ch[i+1];
			}
			ch[i]=temp;
		}
		System.out.println(ch);
	}

}
