import java.util.*;

class CallAreas{

	 int length, height;

	public CallAreas(int x, int y){
		this.length =x;
		this.height =y;

	}
		public double AreaofTriangle(){
		
			
			
			double Area=this.length*this.height*0.5;
			
			return Area;
		}

		public double AreaofRectangle(){

	

		
			double Area=this.length*this.height;
			return Area;
			
		}


		public void AreaOfCircle(){

			
		
			double Area=3.147*this.length;
			System.out.println("Area of Circle is "+Area);

		}

		public static void AreaSquare(int x){
			
					
			int Area=x*x;
			System.out.println("Area of Square is  "+Area);
		}

		}

	

	class ConstructAreas{

		public static void main(String[] args) {

			 int length, height, breadth, radius, Area;
			

			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length.");
			length=sc.nextInt();
			System.out.println("Enter the height.");
			height=sc.nextInt();
			System.out.println("Enter the breadth.");
			breadth=sc.nextInt();
			System.out.println("Enter the radius.");
			radius=sc.nextInt();
			

			CallAreas c = new CallAreas(length,height);
			System.out.println(c.AreaofTriangle());
			CallAreas.AreaSquare(radius);
			
		}

	}
