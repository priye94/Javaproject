package pkg2;

public class Program1 {
	public Program1()
	{
	   this(1, 2, 3);
	   System.out.println("default constructor");
	}
	public Program1(int a, int b, int c, int d)
	{
	 this(1);
	 System.out.println("four parameterize constructor");
	}
	public Program1(int a, int b, int c)
	{
	    System.out.println("three parameterize constructor");
	}

	public Program1(int a, int b)
	{ 
	this(1, 2, 3, 4);
	    System.out.println("two parameterize constructor");
	}

	public Program1(int a)
	{
	this();
	System.out.println("One parameterize constructor");
	}


	
	public static void main(String[] args) {
		
		new Program1(1,2);

	}

}
