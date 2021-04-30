import java.util.*;
class mainBrach{

	public int a, b;

		public mainBrach(int x, int y){
			this.a =x;
			this.b =y;

		}}
		


class childBranch1 extends mainBrach{

 public childBranch1(int x, int y){
 	super(x,y);
 }
	public int square1()
	{
			

		return a*a; 
	}
}

class childBranch2 extends mainBrach{

 public childBranch2(int x, int y){
 	super(x,y);
 }
	public int square2()
	{
			

		return b*b; 
	}
}

class childBranch3 extends mainBrach{

 public childBranch3(int x, int y){
 	super(x,y);
 }
	public int addition()
	{
			

		return a+b; 
	}
}

class childBranch4 extends mainBrach{

 public childBranch4(int x, int y){
 	super(x,y);
 }
	public int multiply()
	{
			

		return a*b; 
	}
}




class inherithierarchical{
	public static void main(String[] args) {
		childBranch1 c1 = new childBranch1(10,20);
		System.out.println(c1.square1());

		childBranch2 c2 = new childBranch2(102,1201);
		System.out.println(c2.square2());

		childBranch3 c3 = new childBranch3(125,245);
		System.out.println(c3.addition());

		childBranch4 c4 = new childBranch4(150,2450);
		System.out.println(c4.multiply());
	}
}