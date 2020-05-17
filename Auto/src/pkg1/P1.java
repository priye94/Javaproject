package pkg1;

public class P1 {
	
	public P1()
	{
		this(1,2,3,4);
		System.out.println("Parent Default Constructor");
	}

	public P1(int a)
	{
		this(1,2);
		System.out.println("Parent 1 Parameterized Constructor");
	}
	
	public P1(int a, int b)
	{
		this();
		System.out.println("Parent 2 Parameterized Constructor");
	}
	
	public P1(int a, int b, int c)
	{
		this(1);
		System.out.println("Parent 3 Parameterized Constructor");
	}
	
	public P1(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		
	}

}
