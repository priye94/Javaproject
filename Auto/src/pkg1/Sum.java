package pkg1;

public class Sum implements inter1 {
	
	public void Calc(int a, int b) //Giving body to abstract method
	{
		int c=a+b;
		System.out.println("Value of sum = "+c);
	}

	public static void main(String[] args) {
		Sum obj1=new Sum();
		obj1.Calc(5, 8);

	}

}
