package pkg1;

public class Exconst1 {

	public Exconst1 ()
	{
		this (1, 2, 3, 4);
		System.out.println("This is default constractor");
	}
	
	public Exconst1 (int a)
	{
		this ();
		System.out.println("This is One parameterized constractor");
	}
	
	public Exconst1 (int a, int b)
	{
		this (1, 2, 3);
		System.out.println("This is Two parameterized constractor");
	}
	
	public Exconst1 (int a, int b, int c)
	{
		this (1);
		System.out.println("This is Three parameterized constractor");
	}
	
	public Exconst1 (int a, int b, int c, int d)
	{
		System.out.println("This is Four parameterized constractor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exconst1(10, 20);

	}

}
