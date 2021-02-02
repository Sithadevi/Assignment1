package Assignment;

import java.util.Scanner;

class Divisibility {

	public static void main(String[] args) {
		int count=0;
		//Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		int n=150;
		for(int i=1;i<=n;i++)
		{
			if(count<5)
			{
				if(i%2==0 && i%3==0 && i%5==0)
				{
					System.out.println(i);
					count++;
				}
			}
		}
	}
}
