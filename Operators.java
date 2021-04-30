import java.util.*;

class Operators

{
	public static void main(String[] args) 
	{
		System.out.println("HelloWorld");
		
		

		/*String FirstName;
		String LastName;
		System.out.println("Enter Your First Name");
		System.out.println("Enter Your Last Name");
		FirstName=sc.nextLine();
		LastName=sc.nextLine();
		System.out.println("Your Name is "+FirstName +" "+LastName);
		*/
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		
		b=sc.nextInt();
		int Addition=a+b;
		int subtraction = a-b;
		int multiplication =a*b;
		int division = a/b;
		int modulus = a%b;

		System.out.println("Addition of two numbers is "+Addition);
		System.out.println("Subtrtaction is" +subtraction);
		System.out.println("multiplication is "+multiplication);
		System.out.println("division of numbers is "+division);
		System.out.println("modulus of numbers is "+modulus);

		a+=b;

		System.out.println("Addition of two numbers" +a);

		a-=b;

		System.out.println("subtraction of assign is" +a);

		a*=b;
		System.out.println("multiplication of assign is "+a);

		a/=b;
		System.out.println("division of assign is" +a);
		
		a%=b;
		System.out.println("modulus of assign is "+a);


		

	}
}