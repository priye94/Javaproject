package pkg3;

public class Test1 {

	int x;
	
	public void M1()
	{
		System.out.println("Hello java");
	}
	
	public void Sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Value of sum = "+c);
	}
	
	
	public static void main(String[] args) {
		
		Test1 ab1=new Test1();
		
		ab1.x=10;
		
		System.out.println(ab1.x);
		
		ab1.x=12;
		
		System.out.println("Change value of X = "+ab1.x);
		
		
		ab1.M1();
		
		ab1.Sum(12, 45);
		
		ab1.Sum(40, 50);
		
			

	}

}
