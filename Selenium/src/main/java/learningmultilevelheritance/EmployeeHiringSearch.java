package learningmultilevelheritance;

public class EmployeeHiringSearch {

	public static void main(String[] args) {
		EmployeeBasicDetails empbasic = new EmployeeBasicDetails();
		EmployeeTechSkills emptech = new  EmployeeTechSkills();
		EmployeeSalary empsal = new EmployeeSalary();
		//empbasic.setEmployeeDetails();
		//empbasic.printEmployeeDetails();
		//emptech.setEmployeeTechSkills();
		//emptech.printEmployeeTechSkills();
		empsal.setEmployeeDetails();
		empsal.printEmployeeDetails();
		empsal.setEmployeeTechSkills();
		empsal.printEmployeeTechSkills();
		empsal.setEmployeeSalary();
		empsal.printEmployeeSalary();
	}

}
