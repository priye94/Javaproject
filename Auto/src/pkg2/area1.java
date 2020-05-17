package pkg2;

public class area1 {

	public void area(int r)//1//
	 {
	     double a=3.14*r*r;
	     System.out.println("area of circle="+a);
	   
	 }
	 public void perimeter(int r)//1//
	 {
	     double p=2*3.14*r;
	   System.out.println("perimeter of circle="+p);
	     
	 }
	   
	    public static void main(String[] args) {
	    
	    area1 aastha=new area1();
	    
	    aastha.area(5); // output=78.5
	    aastha.perimeter(7); //output=43.96
	        
	    }
}
