import java.util.*;

class callNumbers{

	public int a,b,c,d;

	public void Numbers()
	{
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

			System.out.println("The Actual numbers are "+a +" " +b +" " +c +" " +d);
	
	}

	public void Swap(){
		a=a+b+c+d; // a =10+20+30+40 = 100
		b=a-b-c-d; 		// b = 100-20-30-40=10
		c=a-b-c-d;				//c =100-10-30-40=20
		d=a-b-c-d;				//d = 100-10-20-40 =30
		a=a-b-c-d;				// a= 100-10-20-30 = 40

		System.out.println("The Swap numbers are "+a +" " +b +" " +c +" " +d);
	}}

	class ConstructSwap{
		public static void main(String[] args) {
			callNumbers c = new callNumbers();
			c.Numbers();
			c.Swap();
		}
	}
