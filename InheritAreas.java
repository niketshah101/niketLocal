import java.util.*;

class callFirstVariable{
		public int a;

		public callFirstVariable(int x){
			this.a =x;

		}
		public int square()
		{
			return a*a;
		}
}

class callSecondVariable extends callFirstVariable{
int b;
		public callSecondVariable(int x, int y){
			super(x);
			this.b=y;
		
		}
		public int cube(){
			return b*b*b;
		}
}	

class callThirdVariable extends callSecondVariable{
int c;
	public callThirdVariable(int x, int y, int z){
		super(x,y);
		this.c=z;
		
	}
	public int CalculateArea(){
		
	return c*c*c*c;

	}
}

class InheritAreas{

	public static void main(String[] args) {
		callThirdVariable c3 = new callThirdVariable(10,20,30);
		
		
		System.out.println(c3.cube());
		System.out.println(c3.square());
		System.out.println(c3.CalculateArea());

	  long FinalAreas=c3.cube()*c3.square()*c3.CalculateArea();

	  System.out.println(FinalAreas);
	}
}