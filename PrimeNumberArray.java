import java.util.*;

class PrimeNumberArray{
	public static void main(String[] args) {
		
		int[] i =new int [100];
	    int a;
		int b;


	for(a=2;a<99;a++){
		i[a]=1+a;
		
		for(b=2;b<=i[a];b++){
			if(i[a]%b==0){
			//	System.out.println("the wrong prime Number is"+b);
				break;
			}}
		 
		if(b==i[a]){
			System.out.println("prime Number is"+b);
		}	
			













			
			
				

				
		
		 	}
			
			// int no,i;
			// for(no=2;no<100;no++)
			// {
			// 	for(i=2;i<=no;i++)
			// 	{
			// 		if(no%i==0)
			// 		{
			// 			break;
			// 		}
			// 	}
			// 	if(no==i)
			// 	{
			// 		System.out.println("Prime no.."+no);
			// 	}
			// }
		

	}
}