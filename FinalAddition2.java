import java.util.*;

class Add1{
	public int x=10,y=10;

	public void Addition(){
		int c = x+y;
		System.out.println("The First Addition is"+c);
	}
}

class Add2 extends Add1{
	public void Addition(){
		int c1 =x+y+y;
		System.out.println("The Second Addition is"+c1);
	}
}



class FinalAddition2{
	public static void main(String[] args) {
		Add1 a1 = new Add1();
		Add2 a2 = new Add2();
		a1.Addition();
		a2.Addition();
	}
}