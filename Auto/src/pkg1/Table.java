package pkg1;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to print table");
		  int number=s.nextInt();
		  System.out.println("Printing table of: "+number);
		     
		  for(int i=1;i<=10;i++){    
		       int table=number*i;
		       System.out.println(number+" * " +i+" = "+table);
		  }    
				
	}

}
