package learningmultilevelheritance;

public class EmployeeTechSkills extends EmployeeBasicDetails
{
public String langKnown, yrsOfExp;
public void setEmployeeTechSkills()
{
	langKnown = "Java";
	yrsOfExp = "10+";	
}
public void printEmployeeTechSkills()
{
	System.out.println(langKnown);
	System.out.println(yrsOfExp);
}
}
