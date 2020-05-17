package pkg2;

public class Program2 {

	public void s1()
	{
	    System.out.println("default method");
	}
	public void s2(int a, int b, int c, int d)
	{
	 System.out.println("four parameterize method");
	}
	public void s3(int a, int b, int c)
	{
	   System.out.println("three parameterize method");
	}  

	public void s4(int a, int b)
	{ 
	    this.s3(1, 2, 3);
	    this.s1();
	    this.s5(1);
	    this.s2(1, 2, 3, 4);
	    System.out.println("two parameterize method");
	}

	public void s5(int a)
	{
	    System.out.println("one parameterize method");
	}


	public static void main(String[] args) {
		Program2 aastha= new Program2();
	    aastha.s4(1, 2);

	}

}
