import java.util.*;
public class Llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		LinkedList<String> l=new LinkedList<String>();
		System.out.println("\n1.Enter\n2.Delete\n3.Names of size<5\n4.Exit");
		do
		{
			System.out.print("\nEnter ch:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:l.add(sc.next());
					System.out.println(l);
					break;
			case 2:l.remove(0);
					System.out.println(l);
					break;
			case 3:ListIterator<String>i=l.listIterator();
					while(i.hasNext())
					{
						String s=i.next();
						if(s.length()<5)
							System.out.println(s);
					}
			}
		}while(ch!=4);
	}
	
}
