import java.util.*;
class product
{
	private int id;
	private String name;
	private int qty;
	private int rate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
class calculatebill
{
	product p[];
	void calbill(product p[])
	{
		this.p=p;
		System.out.println("display the product");
		System.out.println("\nid\tname\tqty\trate\ttotal");
		int totalbill=0,i;
		for(i=0;i<p.length;i++)
		{
			int total;
	total=p[i].getQty()*p[i].getRate();
totalbill=totalbill+total;
System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t"+total);
		}
		System.out.println("\t\t\t\ttotal="+totalbill);
	

	}
}
public class productapp
{

	public static void main(String[] args) 
	{
		calculatebill c=new calculatebill();
		product p[]=new product[3];
		Scanner xy=new Scanner(System.in);
		int id,qty,rate,i;
		String name;
		for(i=0;i<p.length;i++)
		{
			p[i]=new product();
		System.out.println("enter the id,qty,rate");
			id=xy.nextInt();
			name=xy.next();
			qty=xy.nextInt();
			rate=xy.nextInt();
			p[i].setId(id);
			p[i].setName(name);
			p[i].setQty(qty);
			p[i].setRate(rate);
		}
		c.calbill(p);
		
	}


	}
