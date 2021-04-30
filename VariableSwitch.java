import java.util.*;

class VariableSwitch
{
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = 14;
		

		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();



		a=a+b+c;     
		b=a-b-c;   
		c=a-b-c;    
		a=a-b-c;  

		
		System.out.println("Value of a changed to "+a);

		System.out.println("Value of b changed to "+b);
		System.out.println("Value of c changed to "+c);

	}
}
