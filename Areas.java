import java.util.*;


class Areas
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Enter first no.");
		a=sc.nextInt();
		System.out.println("Enter second no.");
		b=sc.nextInt();
		System.out.println("Enter third no.");
		c=sc.nextInt();
		int rectArea = a*b;
		double circleArea = 3.14*a*a;
		int volumeOfCube = a*b*c;
		
		
		System.out.println("Area of square is" +rectArea); 
		System.out.println("Area of square is" +circleArea); 
		System.out.println("Area of square is" +volumeOfCube); 

		if (rectArea>circleArea) {
			System.out.println("Area of rectangle is greater than Area of circle");
		}else{
			System.out.println("Area of circle is greater than Area of square");
		}
		
	}
}