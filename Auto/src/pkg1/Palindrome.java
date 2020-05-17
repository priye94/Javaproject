package pkg1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		  int a, b, sum=0;   
		  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to check palindrome");
		int c=s.nextInt();
		   
		  b=c; 
		  while(c>0){    
		   a=c%10;  //getting remainder  
		   sum=(sum*10)+a;    
		   c=c/10;
		  }    
		  if(b==sum)    
		   System.out.println("palindrome number");    
		  else    
		   System.out.println("not palindrome");    
		}  

}
