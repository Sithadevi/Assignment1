package Assignment;

import java.util.Scanner;

class SumOfDight {

	public static void main(String[] args) {
		int num =0, rem=0, sum=0;		
		System.out.println("Please Enter Any Number");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of Digits is "+ sum);
	}

}
