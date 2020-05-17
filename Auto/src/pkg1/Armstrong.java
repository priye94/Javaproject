package pkg1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int c=0,a,b;  
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to check armstrong");
		int n=s.nextInt();
		 
	    b=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(b==c)  {
	    System.out.println("armstrong number");   
	    }
	    else { 
	        System.out.println("Not armstrong number"); 
	    }
	   }  

	}



