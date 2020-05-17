package pkg1;

public class P2 extends P1
{

	public P2()
	{
		this(1,2,3);
		System.out.println("Child Default parameterized Constructor");
	}
	
	public P2(int a)
	{
		this(1,2,3,4);
		System.out.println("Child 1 parameterized Constructor");
	}
	
	public P2(int a, int b)
	{
		this(1);
		System.out.println("Child 2 parameterized Constructor");
	}
	
	public P2(int a, int b, int c)
	{
		super(1,2,3);
		System.out.println("Child 3 parameterized Constructor");
	}
	
	public P2(int a, int b, int c, int d)
	{
		this();
		System.out.println("Child 4 parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
		P2 obj1=new P2(1, 2);

	}

}
