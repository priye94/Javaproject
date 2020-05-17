package pkg2;

//Solve expression 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))//

public class expression1 {
	
	public double div1 (double a, double b)
	{
		double c= a/b;
		return c;
	}
	
	public double sub1 (double d, double e)
	{
		double f= d-e;
		return f;
	}
	
	public double multi1 (double g, double h)
	{
		double i= g*h;
		return i;
	}
	
	public double sum1 (double j, double k)
	{
		double l= j+k;
		return l;
	}

	public static void main(String[] args) {
		
		expression1 aastha = new expression1 ();
		double ab=aastha.div1(1.0, 3);
		double cd=aastha.sub1(1, ab);
		double ef=aastha.multi1(4, cd); // 4.0 * (1 - (1.0/3)
		double gh=aastha.div1(1.0, 5); // divide (1.0/5)
		double ij=aastha.div1(1.0, 7); // divide (1.0/7)
		double kl=aastha.div1(1.0, 9); // divide (1.0/9)
		double mn=aastha.div1(1.0, 11); // divide (1.0/11)
		double op=aastha.sum1(ef, gh); // 4.0 * (1 - (1.0/3) + (1.0/5)
		double qr=aastha.sub1(op, ij); // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7)
		double st=aastha.sum1(qr, kl); // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9)
		double uv=aastha.sub1(st, mn);
		System.out.println("The final result of the expression is = "+uv);
		

	}

	}






  