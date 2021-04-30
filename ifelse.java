import java.util.*;

class ifelse{


public static void main(String[] args) {
	int a;
	int b;
	int personAge;
	int signCheck;
	

	Scanner sc = new Scanner(System.in);

	a=sc.nextInt();
	

	if(a==6){
		System.out.println("Welcome");
	}




	
	
	b=sc.nextInt();

	if(a>b){
		System.out.println("First value is greater than Second");
	}else{
		System.out.println("Second value is greater than First");
	}


	
	System.out.println("Enter person's Age ");
	personAge=sc.nextInt();

	if (personAge >=18) {
		System.out.println("Person is eligible to vote");
		
	}else {
		System.out.println("Person cannot vote");
	}


//----------
	if (personAge % 2 == 0) {
		System.out.println("The PersonAge number is Even");
	}
	else
	{System.out.println("The PersonAge number is Odd");
}	

		System.out.println("Enter any number ");
		signCheck=sc.nextInt();


//----------
	if (signCheck<0) 
		{
			System.out.println("The number is negative");
	}
	else
	{System.out.println("The number is negative");
	}



}
}