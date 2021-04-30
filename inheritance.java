import java.util.*;

class callClass1{


	public int a,b;
	public callClass1(int x, int y){

		this.a =x;
		this.b =y;

	}
	public int multiplication(){
		return a*b;
	}

}

class callClass2 extends callClass1{
	public int c;
	public callClass2(int x, int y, int z){
		super(x,y);
	this.c =z;
	}
	public void addition(){
		System.out.println("The addition is "+(a+b+c));
	}

}

class inheritance{
	public static void main(String[] args) {
		
	
	
	callClass2 c2 = new callClass2(10,20,30);
	c2.addition();
	System.out.println(c2.multiplication());
}}