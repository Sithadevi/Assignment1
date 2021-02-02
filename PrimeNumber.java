package Assignment;

import java.util.Scanner;

class PrimeNumber {

	public static void main(String[] args) {
		  int num,a,b; 
          Scanner sc =new Scanner(System.in); 
          System.out.println("Enter a number"); 
          num =sc.nextInt(); 
          a=1; 
          b=0; 
           while(a<= num) 
              { 
                  if((num%a)==0) 
                     b=b+1; 
                     a++; 
              } 
               if(b==2) 
               System.out.println(num +" is a prime number"); 
               else 
               System.out.println(num +" is not a prime number"); 

	}

}
