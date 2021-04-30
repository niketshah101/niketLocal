import java.util.*;

class ReplaceHighest{
	
	public static void main(String[] args) {
		
		int []a = {12,41,13,15,656,96,98574,7854,555};
		
		int i,j,c,input;

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the highest location to be replaced");

		input = sc.nextInt();



		for(i=0;i<a.length;i++){
			for(j=i+1;j<a.length;j++){
					if(a[i]>a[j]){
				c = a[i];
				a[i] = a[j];
				a[j] =c;

			}	}
		//	System.out.println(a[i]);
			if(i==input){
				System.out.println("The value needed is "+a[i]);
			}


		}


}}