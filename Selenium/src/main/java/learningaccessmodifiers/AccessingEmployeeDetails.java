package learningaccessmodifiers;

public class AccessingEmployeeDetails
{

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.empName = "Ramesh";
		emp.empNo = 10010;
		emp.empSalary = 1100000;
		emp.printEmpName();
		emp.printEmpNo();
		emp.printEmpSalary();
	}

}
