package Assignment;

import java.util.Scanner;

class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		 int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) {
			  	System.out.println("palindrome");  
		  }
		  else {
			  System.out.println("not palindrome"); 
			  }
		  
	}

}
