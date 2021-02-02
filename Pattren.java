package Assignment;

import java.util.Scanner;

class Pattren {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for (int i=rows; i >= 1; i--) 
	    {
	      for (int j = 1; j <=i;j++)
	      {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	}
}
