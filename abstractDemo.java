import java.util.*;

abstract class Addition {
	public int x,y;
	public abstract void add();
} 

class AdditionDefined extends Addition{

	public void add(){
		Scanner sc = new Scanner(System.in);
		x= sc.nextInt();
		y= sc.nextInt();

		System.out.println("The Sum is "+(x+y));
	}
}


class abstractDemo{
	public static void main(String[] args) {
		
	
	AdditionDefined ad = new AdditionDefined();
	ad.add();
	}
}