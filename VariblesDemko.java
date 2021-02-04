public class VariblesDemko {
	
	int a=10;// global or instance variables
	static int b=20;//static variable
	void fun1(int x)// x is a local variable
	{
		System.out.println("Value of a"+a);
		System.out.println("Value of x"+x);
		
	}
	void fun2(int y)// x is a local variable
	{
		System.out.println("Value of a"+a);
		System.out.println("Value of x"+y);
	}
	


	public static void main(String[] args) {
		VariblesDemko varibleDemo = new VariblesDemko();
		System.out.println(varibleDemo.a);
		System.out.println(b);
		varibleDemo.a=45;
		
	}

}
