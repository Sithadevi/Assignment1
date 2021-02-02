package Assignment;

import java.util.Scanner;

class ReverseNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int rev=0;
		while(n>0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		System.out.println("Reversed number is "+rev);

	}

}
