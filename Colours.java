package Assignment;
import java.util.Scanner;

public class Colours{
		public static void main(String[] args)
		{
		System.out.println("Enter the character:");
	    Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		switch(ch)
		{
			case 'R':
				System.out.println("Red");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("white");
				break;
			default:
				System.out.println("Invalid input");
		}
	}
}
