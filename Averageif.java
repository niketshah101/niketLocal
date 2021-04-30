import java.util.*;

class Averageif {

	public static void main(String[] args) {
		
	
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	
	

	Scanner sc =new Scanner(System.in);

	System.out.println("Enter the firstNumber");
	firstNumber=sc.nextInt();

	System.out.println("Enter the secondNumber");
	secondNumber=sc.nextInt();

	System.out.println("Enter the thirdNumber");
	thirdNumber=sc.nextInt();


	int sum=firstNumber+secondNumber+thirdNumber;

	int average=sum/3;

	//int thirdhighest;


	if (average<100 && average>=75) 
	{
		System.out.println("Distinction");
		System.out.println("Enter a number from 1,2 or 3 to see the scores");
		int maxScore=sc.nextInt();
		if (maxScore == 1) {
			
		
			if (firstNumber>secondNumber && firstNumber>thirdNumber) {
			
			System.out.println("the Highest score is "+firstNumber);
			
			}
			}
			else if (maxScore == 2) {
			
		
			if (firstNumber<secondNumber && secondNumber>thirdNumber) {
			
			System.out.println("the Highest score is "+firstNumber);
			
			}
		}
			else if (maxScore == 3) {
			
		
			if (firstNumber<thirdNumber && secondNumber<thirdNumber) {
			
			System.out.println("the Highest score is "+thirdNumber);
			
			}
		}
		else
		{
		System.out.println("invalid");	
		}
	


		


}}}