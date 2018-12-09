import java.util.*;
abstract class Vehicl {
	int yom;
	abstract void getData();
	abstract void putData();
}
class TwoWheeler extends Vehicl
{
	Scanner sc=new Scanner(System.in);
	String brand;
	void getData()
	{
		System.out.print("Enter year of manufacture:");
		yom=sc.nextInt();
		System.out.print("\nEnter brand:");
		brand=sc.next();
		putData();
	}
	void putData()
	{
		System.out.println("\nYear of manufacture:"+yom);
		System.out.println("Brand: "+brand);
	}
}
final class FourWheeler extends Vehicl
{
	Scanner sc=new Scanner(System.in);
	String brand;
	void getData()
	{
		System.out.print("Enter year of manufacture:");
		yom=sc.nextInt();
		putData();
	}
	void putData()
	{
		System.out.println("\nYear of manufacture:"+yom);
	}
}
class MyTwoWheeler extends TwoWheeler
{
	Scanner sc=new Scanner(System.in);
	String name;
	MyTwoWheeler(int y)
	{
		System.out.println("\nEnter owner name:");
		name=sc.next();
		super.yom=y;
	}
	void putData()
	{
		System.out.println("Owner name:"+name);
		System.out.println("Year of manufacture:"+yom);
	}
}
class Vehicle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TwoWheeler scooter=new TwoWheeler();
		FourWheeler car=new FourWheeler();
		scooter.getData();
		car.getData();
		System.out.print("Enter year of manufacture of MyTwoWheeler:");
		int y=sc.nextInt();
		MyTwoWheeler cycle=new MyTwoWheeler(y);
		cycle.putData();
	}
}