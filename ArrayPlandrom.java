import java.util.*;

class ArrayPlandrom{
	public static void main(String[] args) {
		int []a={5,69,20,7};
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++){
			
			b+=a[i];
			

		
		}System.out.println(b);
		System.out.println(reverseNumber(b));
		

	}

	

  public static int reverseNumber(int c){

   		int dig;
   		int reversno=0;


   		for(int i=0;i>100;i++)
   		{

   			dig=c%10;  
   			 
   			reversno = reversno*10+ dig;		
   			c =c/10; 


   		}

   		return reversno;



   }



}
