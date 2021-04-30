import java.util.*;


class Employee{

	public String Name;
	public int EmployeeId;
	public int Salary1;

	public Employee(){

	Scanner sc = new Scanner(System.in);
	Name=sc.nextLine();
	EmployeeId=sc.nextInt();
	Salary1=sc.nextInt();
}


	public Double CalculateTax(){

		Double Tax;

	if(Salary1>15000){
		Tax = 0.03*Salary1;


	}else if(Salary1>30000){
		Tax = 0.07*Salary1;
	}
	else{
		Tax = 0.00;
	}
	return Tax;
	
}}