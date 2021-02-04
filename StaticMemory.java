class student
{
	int id;
	String name;
	static String companyName="abc company";
	
}




public class StaticMemory {

	public static void main(String[] args) {
		student ravi= new student();
		ravi.id=1;
		ravi.name="ravi kumar";
		
		student ramesh= new student();
		ramesh.id=2;
		ramesh.name="ramesh kumar";
		ramesh.companyName="hcl";
		
		student kumar= new student();
		kumar.id=2;
		kumar.name="ramesh kumar";
		kumar.companyName="Fujitsu";
		
		
		System.out.println(ravi.id+""+ravi.name+""+""+ravi.companyName);
		System.out.println(ramesh.id+""+ramesh.name+""+""+ramesh.companyName);
		System.out.println(kumar.id+""+kumar.name+""+""+kumar.companyName);
		
		
		
	}

}
