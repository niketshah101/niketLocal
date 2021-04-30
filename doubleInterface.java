import java.util.*;


interface partData{
	public double area();
	public double volume();

}

interface materialData{
	public double specificGravity();
	public double materialCost();
}

class cube implements partData, materialData{
	 double a,b,c,d,e;
	public cube(double x, double y, double z,double p, double q){
		this.a =x;
		this.b =y;
		this.c =z;
		this.d =p;
		this.e =q;

	}
	public double area(){

		double areaFind= 2*this.a*this.b+2*this.a*this.c+2*this.b*this.c;
		return areaFind;
	}

	public double volume(){
		double volumeFind =this.a*this.b*this.c;
		return volumeFind;
	}
	public double specificGravity(){
		return this.d;
	}
	public double materialCost(){
		return this.e;
	}
}


class cylinder implements partData, materialData{
	 double a,c,d,e;
	public cylinder(double x, double z,double p, double q){
		this.a =x;
		
		this.c =z;
		this.d =p;
		this.e =q;

	}
	public double area(){

		double areaFind= 3.14*this.a*this.a+2*this.a*this.c;
		return areaFind;
	}

	public double volume(){
		double volumeFind =3.14*this.a*this.a*this.c;
		return volumeFind;
	}
	public double specificGravity(){
		return this.d;
	}
	public double materialCost(){
		return this.e;
	}
}



class doubleInterface{
	public static void main(String[] args) {
		cube c1 = new cube(10,20,30,1.24,2.55);
		System.out.println("Area of cuboid is -->"+c1.area());
		System.out.println("volume of cuboid is -->"+c1.volume());
		System.out.println("Material Specific gravity of cuboid is -->"+c1.specificGravity());
		System.out.println("Material cost for the cuboid is -->"+c1.materialCost());

System.out.println("===================================");
		cylinder c2 = new cylinder(10,30,1.04,4.65);	
		System.out.println("Area of cylinder is -->"+c2.area());
		System.out.println("volume of cylinder is -->"+c2.volume());
		System.out.println("Material Specific gravity of cylinder is -->"+c2.specificGravity());
		System.out.println("Material cost for the cylinder is -->"+c2.materialCost());

	}
	
}