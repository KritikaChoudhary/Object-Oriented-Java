import java.util.*;
import java.lang.Math;
class Circle {
	Scanner sc=new Scanner(System.in);
	int radius;
	Circle()
	{
		
	}
	Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}
	double area()
	{
		System.out.print("Area of circle");
		return Math.PI*radius*radius;
	}
}
class Sector extends Circle
{
	float angle;
	Sector()
	{
		
	}
	Sector(float angle,int r) {
		// TODO Auto-generated constructor stub
		super(r);
		this.angle=angle;
	}
	double area()
	{
		System.out.print("Area of sector");
		return (angle*radius*radius)/2;
	}
	
}
class Segment extends Circle
{
	float length;
	Segment()
	{
		
	}
	Segment(float length,int r) {
		// TODO Auto-generated constructor st
		super(r);
		this.length=length;
	}
	double area()
	{
		System.out.print("Area of segment");
		double h=radius-Math.pow((Math.pow(radius,2)-Math.pow(length, 2)),0.5);
		return (((2*h*length)/3)+((h*h*h)/(2*length)));
	}
}
class Main
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\nArea of\n1.Circle\n2.Segment\n3.Sector\n4.Exit\nEnter choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.print("Enter the radius of the circle:");
					int r=sc.nextInt();
					Circle c=new Circle(r);
					System.out.print(c.area());
					break;
			case 2:	System.out.print("Enter the radius of the circle:");
					int rad=sc.nextInt();
					System.out.print("\nEnter the length of the segment:");
					float f=sc.nextFloat();
					Segment s=new Segment(f,rad);
					System.out.print(s.area());
					break;
			case 3:System.out.print("Enter the radius of the circle:");
					int radi=sc.nextInt();
					System.out.print("\nEnter the angle of the segment:");
					float a=sc.nextFloat();
					Sector p=new Sector(a,radi);
					System.out.print(p.area());
			}
		
		}while(ch!=4);
		
	}
}
