class Student1{
	int id;
	String name;
	String dept;
	/*Student1()
	{
		System.out.println("default constructor");
	}*/
	Student1(int i, String n, String d)
	{
		System.out.println("parametrized constructor");
		this.id=i;
		this.name=n;
		this.dept=d;
	}
	
	void display()
	{
		System.out.println("id"+ id);
		System.out.println("name"+ name);
		System.out.println("dept"+ dept);
	}
	
}
class ConstructorDemo {

	public static void main(String[] args) {
		Student1 obj=new Student1(1,"sam","jan");
		obj.display();
		
	}

}
