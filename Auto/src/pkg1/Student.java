package pkg1;

public class Student 
{
	int age;
	int roll_no;
	
   public void display1 ()
   {
	   System.out.println ("Welcome to All of you");
   }
	
   public void display2 ()
   {
	   System.out.println ("Automation is very easy");
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ranjan = new Student ();
        ranjan.age=25;
        System.out.println (ranjan.age);
        ranjan.roll_no=80;
        System.out.println (ranjan.roll_no);
        ranjan.display1 ();
        ranjan.display2 ();

	}

}
