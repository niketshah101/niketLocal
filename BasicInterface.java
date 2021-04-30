
import java.util.*;


interface areas{
	public double circle();
}

class AreaMethods implements areas{

	public double circle(){
		int r = 10;

		double circleArea = 3.14*r*r;
		return circleArea;

	}
}

class BasicInterface{
	public static void main(String[] args) {
		AreaMethods am1 = new AreaMethods();
		System.out.println(am1.circle());
	}
	
}