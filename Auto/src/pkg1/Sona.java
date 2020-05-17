package pkg1;
//solve (10+2)
// solve expression (((10+2)-2)*2

public class Sona {
	
	public int sum (int a, int b)
	{
		int c=a+b;
		System.out.println("value of sum is = "+c);
		return c;
	}
	
	public int sub (int e, int f)
	{
		int g = e-f;
		System.out.println("value of sub is = "+g);
		return g;
	}

	public void multi (int i, int j)
	{
		int k =i*j;
		System.out.println ("The final value of expression is = "+k);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sona a1=new Sona ();
		int d = a1.sum(10, 2);
		int h = a1.sub(d, 2);
		a1.multi(h, 2);

	}

}
