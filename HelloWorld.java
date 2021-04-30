import java.util.*;

class HelloWorld

{
	public static void main(String[] args) 
	{
		System.out.println("HelloWorld");
		
		Scanner sc = new Scanner(System.in);

		/*String FirstName;
		String LastName;
		System.out.println("Enter Your First Name");
		System.out.println("Enter Your Last Name");
		FirstName=sc.nextLine();
		LastName=sc.nextLine();
		System.out.println("Your Name is "+FirstName +" "+LastName);
		*/

		int a;
		
		int b;
		System.out.println("Enter the second number");
		System.out.println("Enter the first number");
		a=sc.nextint();
		b=sc.nextint();
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
	}
}