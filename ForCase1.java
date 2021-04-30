import java.util.*;

class ForCase1{
	public static void main(String[] args) {



		// for(int i=1;i<=10;i++)
		// {
		// 	System.out.println("The loop number is " +i);
		// }

		// int c=1;
		// while(c<=10)
		// {
		// 	System.out.println(c);
		// 	c++;
		// }


		int j=10;
		do
		{
			System.out.println(j);
			j--;
		}while(j>=1);

System.out.println("-------------For loop below ----------------------");

		for(int i=10;i>=1;i--){
			System.out.println(i);
		}

		int dig;
		int reverseno=0;
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();

		while(number>0)
		{
			
			dig=number%10;          					   //113%10=3;
			reverseno = reverseno*10+dig;					//reverseno = 1*10+3=13
			number =number/10;					

		}
		System.out.println(reverseno);
	}
}