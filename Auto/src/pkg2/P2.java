package pkg2;

public class P2 extends P1 
{

	public void method5()
	{
		System.out.println("Child Default parameterized Method");
	}
	
	public void method6(int a)
	{
		System.out.println("Child 1 parameterized Method");
	}
	
	public void method7(int a, int b)
	{
		super.method3(1,2,3);
		this.method8(1,2,3);
		this.method5();
		this.method9(1,2,3,4);
		this.method6(1);
		System.out.println("Child 2 parameterized Method");
	}
	
	public void method8(int a, int b, int c)
	{
		System.out.println("Child 3 parameterized Method");
	}
	
	public void method9(int a, int b, int c, int d)
	{
		System.out.println("Child 4 parameterized Method");
	}
	
	public static void main(String[] args) {
		P2 obj1=new P2();
		obj1.method7(1, 2);

	}

}
