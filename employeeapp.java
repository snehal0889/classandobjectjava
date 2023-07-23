import java.util.*;
class student
{
	int a[],agg=0,per;
	void set(int x[])
	{
		this.a=x;
	}
	void calper()
	{
		for(int i=0;i<a.length;i++)
		{
			agg=agg+a[i];
		}
		per=agg/6;
		System.out.println("per of student is "+per);
	}
	void check()
	{
		if(per>=75 &&per<=100)
		{
			System.out.println("distinction");
		}
		else if(per>=60&&per<=75)
		{
			System.out.println("1st class");
		}	
		else if(per>=50&&per<=60)
		{
			System.out.println("2nd class");
		}	
		else if(per>40 &&per<=50)
		{
			System.out.println("3rd class");
		}	
		else
		{
			System.out.println("fail");
		}
	}
	
}
public class employeeapp 
{

	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("enter");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		student s=new student();
		s.set(a);
		s.calper();
		s.check();
		
		
		
		
	}

}
