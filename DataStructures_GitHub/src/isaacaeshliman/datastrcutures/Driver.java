package isaacaeshliman.datastrcutures;

public class Driver
{
	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		Person p1 = new Person("Isaac");
		Person p2 = new Person("Daniel");
		Person p3 = new Person("Cooper");
		Person p4 = new Person("Eli");
		Person p5 = new Person("Isaac");
		
		list.insert(p1);
		list.insert(p2);
		list.insert(p3);
		list.insert(p4);
		list.insert(p5);
		
		System.out.print("\nPre Delete:\n" + list);
		
		list.delete(new Person("Eli"));
		
		System.out.print("\nPost Delete:\n" + list);
		
		System.out.print("\nResult " + list.search(new Person("Eli")));
	}
}
