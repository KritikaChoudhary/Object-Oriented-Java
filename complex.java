package first;
import java.util.Scanner;
class complexes
{
	Scanner sc=new Scanner(System.in);
	int r1,r2,i1,i2;
	complexes()
	{
		System.out.println("Enter two complex no:");
		r1=sc.nextInt();
		i1=sc.nextInt();
		r2=sc.nextInt();
		i2=sc.nextInt();
		System.out.println("No. entered: "+r1+"+i"+i1+" and "+r2+"+i"+i2);
	}
	void add()
	{
		System.out.println("Sum="+(r1+r2)+"+i"+(i1+i2));
	}
	void sub()
	{
		System.out.println("Difference="+(r1-r2)+"+i"+(i1-i2));
	}
	void mul()
	{
		System.out.println("Product="+(r1*r2-i1*i2)+"+i"+(r1*i2+r2*i1));
	}
}
public class complex
{
	public static void main(String args[])
	{
	do
	{
		complexes c=new complexes();
		c.add();
		c.sub();
		c.mul();
	}while(true);
}
}
