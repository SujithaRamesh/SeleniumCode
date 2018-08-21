package learningmultilevelheritance;

public class EmployeeBasicDetails {

	public String name, location, gender;
	public int age;
	public void setEmployeeDetails()
	{
		name = "Ramesh";
		location = "Chennai";
		age = 33;
		gender = "Male";		
	}
	public void printEmployeeDetails()
	{
		System.out.println(name+" , "+location+" , "+age+" , "+gender);
	}
	private void printEmpName()
	{
		System.out.println(name);
	}
	
}
