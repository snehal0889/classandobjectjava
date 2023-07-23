 package constuctor;
import java.util.*;
class armstrong
{
	int no,temp,i,c=0,rem,sum=0,p;
	armstrong(int no)
	{
		this.no=no;
	}
	int getresult()
	{
		temp=no;
		while(no!=0)
		{
			no=no/10;
			c++;
		}
		no=temp;
		while(no!=0)
		{
			p=1;
			rem=no%10;
			no=no/10;
		for(i=1;i<=c;i++)
		{
			p=p*rem;
		}
		sum=sum+p;
		}
		if(temp==sum)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
}

public class armstrongapp
{

	public static void main(String[] args) 
	{
	Scanner x=new Scanner(System.in);
	System.out.println("enter the number");
	int no=x.nextInt();
	armstrong a=new armstrong(no);
	int result=a.getresult();
	if(result==1)
	{
	System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}

	}

}
