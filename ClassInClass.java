import java.util.*;

class Addition1{
	public int x,y,z;

	class Addition2{

		public int AddFunction(){
			System.out.println("Enter the two values");
			Scanner sc =new Scanner(System.in);
			x=sc.nextInt();
			y=sc.nextInt();
			z=x+y;
			return z;
		}
	}

	class Multiply2{
		public int MultiFunction(){
			int multi = x*y;
			return multi;
		}
	}
}

class Addition1Child1 extends Addition1{
		
		class Reminder{

			public int Reminder1(){
			System.out.println("Enter the two values");
			Scanner sc =new Scanner(System.in);
			x=sc.nextInt();
			y=sc.nextInt();
				int FindReminder = y%x;
				return FindReminder;
			}
		}
}




class ClassInClass{
	
	public static void main(String[] args) {
		Addition1 a1 = new Addition1();
		Addition1.Addition2 a2 =a1.new Addition2();
		System.out.println("The sum is "+a2.AddFunction());


		Addition1.Multiply2 m2= a1.new Multiply2();
		System.out.println("The product is "+m2.MultiFunction());

		Addition1Child1 ac1 = new Addition1Child1();
		Addition1Child1.Reminder ar1 = ac1.new Reminder();
		System.out.println("The remainder is "+ar1.Reminder1());
	}
}