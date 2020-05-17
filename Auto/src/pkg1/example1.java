package pkg1;

import pkg2.expression1;

public class example1
{
	int age;
	int roll_no;
	
   public void display1 ()
   {
	   System.out.println ("Welcome to All of you");
   }
	
   public void display2 ()
   {
	   System.out.println ("Java is very easy");
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 aastha = new example1 ();
        int a=aastha.age=12;
        System.out.println ("age is = "+a);
        int b=aastha.roll_no=02;
        System.out.println ("Roll no is ="+b);
        aastha.display1 ();
        aastha.display2 ();

	}
}




