class seller
{
	int sp,cp;
	void set(int sp,int cp)
	{
		this.sp=sp;
		this.cp=cp;
	}
	void show()
	{
		if(sp>cp)
		{
			System.out.println("profit");
		}
		else
		{
			System.out.println("loss");
		}
	}
}

public class sellerprice 
{

	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the sp and cp");
		int sp=xyz.nextInt();
		int cp=xyz.nextInt();
		seller se=new seller();
		se.set(sp, cp);
		se.show();
	}

}
