import java.util.*;

class Add1
{
		
			 
		public void theAddition(int a, int b){
			 
			System.out.println("The first addition is "+(a+b));
		}

}

class Add2 extends Add1{
		
		public void theAddition(int a , int b){
			int z= a+2*b;
			System.out.println("The Second addition "+z);
		}
}

class FinalAddition{
	public static void main(String[] args) 
	{
		Add1 a1 =new Add1();
		
		Add2 a2 =new Add2();
		a1.theAddition(10,20);
		a2.theAddition(11,22);
	}
}