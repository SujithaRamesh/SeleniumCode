package learningaccessmodifiers;

public class Employee 
{
	public String empName = "Sindhuja";
	int empNo = 10011;
	private int empAge = 25;
	protected int empSalary = 425000;
	public void printEmpName()
	{
		System.out.println(empName);
	}
	void printEmpNo()
	{
		System.out.println(empNo);
	}
	private void printEmpAge()
	{
		System.out.println(empAge);
	}
	protected void printEmpSalary()
	{
		System.out.println(empSalary);
	}
}
