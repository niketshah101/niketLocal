import java.util.*;

class DemoClass1{
	int x=0;
	public int multiplications(int a, int b){
		int c =a*b;
		return c;
	}

	public int addition(int a, int b){
		int c =a+b;
		return c;
	}
	 public int reverseNumber(int a){
	 	int dig=0;  
	 	int reverseNo=0;
	 	while(a>0){

	 		dig = a%10; // 11%10 = 1
	 		reverseNo = reverseNo*10 + dig     ;   // 0*10+  1
	 		a=a/10;
	 	}return reverseNo;


	 }
}


class DemoClass{
	public static void main(String[] args) {
		 DemoClass1 D =new DemoClass1();
		 int newnumber1 =121;
		 int newnumber2 = 30;
	System.out.println(D.multiplications(newnumber1,newnumber2));
	System.out.println(D.addition(newnumber1,newnumber2));
	System.out.println(D.reverseNumber(D.addition(newnumber1,newnumber2)));
	}
}