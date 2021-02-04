package encapsulation;
class Employee{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
}
class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e =new Employee();
		e.setId(2);
		e.setName("sita");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
		
	}

}
