import java.util.*;

class WhileCase1{

	public static void main(String[] args) {
		int number;
		int dig;
		int reverseno=0;
		Scanner sc =new Scanner(System.in);
		number=sc.nextInt();

		while(number>0)
		{
			
			dig=number%10;          					   //113%10=3;
			reverseno = reverseno*10+dig;					//reverseno = 1*10+3=13
			number =number/10;					

		}
		System.out.println(reverseno);
	} 
	
}
