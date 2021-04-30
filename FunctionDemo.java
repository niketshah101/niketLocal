import java.util.*;

class FunctionDemo{


	public static void main(String[] args) {
			int a,b;

		show(); 
		show1(5,5,5);
		System.out.println("the value for return with no argument is "+show2());
		System.out.println("----------------------------------------" );
		System.out.println("the value for return with argument is " );
		System.out.println("Enter two values to get the sequence is " );


		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		
		for(int i = a;i<b;i++ ){


		System.out.println(show3(i));
	}
		
	}

	public static void show(){

		int a = 10;
		int b = 15;
		int c = a+b;
		System.out.println("the value for no return no argument  " +c);



	}

	public static void show1(int a, int b,int c){

		

		int d = a*b*c;

		System.out.println("the value for no return with argument is " +d);


	}

	public static int show2(){
		System.out.println(" ------------------------------------------------");
		System.out.println(" ------------------------------------------------");
		System.out.println(" Please Enter the values to Subtract");

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a -b;
		return c;


	}


	public static int show3(int a){
		for(int i=a;i<a+1;i++)
		{
			i =a;
		}
				
		return a;


		

	}

}