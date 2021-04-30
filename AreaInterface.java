import java.util.*;


interface areas{
	public double area();
}

class Square implements areas{
int a,b;
public Square(int x, int y){
	this.a =x;
	this.b = y;
}

public double area(){
	double sqArea = a*b;

	return sqArea;
}


}

class Circle{
	public double area(){
		int r=10;
		double circleAreas = 3.14*r*r;
		return circleAreas;
	}
}



class AreaInterface{
	public static void main(String[] args) {
		Square sq = new Square(10,20);
		System.out.println("Area of square is "+sq.area());
		Circle cir = new Circle();
		System.out.println("Area of circle is "+cir.area());

	}
	
}