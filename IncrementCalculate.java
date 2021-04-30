import java.util.*;


class FindDesignation{

	public String employeeName;
	public String designation;
	public int basicSalary, yearsExperience, incrementPercent;

	public FindDesignation(String eN, String de, int bS, int yE){

		this.employeeName =eN;
		this.designation =de;
		this.basicSalary = bS;
		this.yearsExperience =yE;
		
		
		}
		public void DesignationFinder()
		{
				if(this.designation == "Manager"){
			
				if(this.yearsExperience>=15){
					this.incrementPercent =15;
				}else if (this.yearsExperience<15 && this.yearsExperience>=10) {
					incrementPercent =10;
				}else if (this.yearsExperience<10 && this.yearsExperience>=5) {
					this.incrementPercent =5;
				}else{
					this.incrementPercent =0;
				}
			}
		else if(this.designation == "TeamLeader"){
			
			if(this.yearsExperience>=15){
					this.incrementPercent =15;
				}else if (this.yearsExperience<15 && this.yearsExperience>=10) {
					this.incrementPercent =10;
				}else if (this.yearsExperience<10 && this.yearsExperience>=5) {
					this.incrementPercent =5;
				}else{
					this.incrementPercent =0;
				}
			}
			else if (this.designation == "Developer") {
					
				if(this.yearsExperience>=15){
					this.incrementPercent =15;
				}else if (this.yearsExperience<15 && this.yearsExperience>=10) {
					incrementPercent =10;
				}else if (this.yearsExperience<10 && this.yearsExperience>=5) {
					this.incrementPercent =5;
				}else{
					this.incrementPercent =0;
				}
			}
			else {
				System.out.println(" Invalid Designation");
			}


			double newSalary = this.basicSalary*this.incrementPercent*0.01+this.basicSalary;
			System.out.println("The salary after increment is " +newSalary);
	}
}

class IncrementCalculate{

	public static void main(String[] args) {
		
	
String employeeName="Niket";
	String designation="Manager";
	int basicSalary=80000, yearsExperience=16;

	FindDesignation f = new FindDesignation(employeeName,designation,basicSalary,yearsExperience);
	f.DesignationFinder();

}}