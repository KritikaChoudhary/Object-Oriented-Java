package first;
import java.util.Scanner;
public abstract class Vehicle 
{
	Vehicle()
	{
		yom=0;
	}
	 int yom;
	 abstract void getData(int a);
	 abstract void putData();
}
class tW extends Vehicle
{
	void getData(int a)
	{
		System.out.println("twoWheeler class");
		yom=a;
	}
	void putData()
	{
		System.out.println("Year of manufacture of twowheeler:"+yom);
	}
}
final class fW extends Vehicle
{
	void getData(int a)
	{
		System.out.println("FourWheeler class");
		yom=a;
	}
	void putData()
	{
		System.out.println("Year of manufacture of fourwheeler:"+yom);
	}
}
class mtW extends tW
{
	void getdata(int a)
	{
		super.getData(a);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		mtW m=new mtW();
		System.out.println("Enter year of manufacture of twowheeler:");
		m.getData(sc.nextInt());
		m.putData();
		fW f=new fW();
		System.out.println("Enter year of manufacture of fourwheeler:");
		f.getData(sc.nextInt());
		f.putData();
	}

}
