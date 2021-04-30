import java.util.*;

class FindEvenOut{
	public static void main(String[] args) {
		int arr1[]= new int[10];
		int count=0;
		
		int a;
		int b=0;
		
		
		Scanner sc = new Scanner(System.in);
		

		for(a=0;a<10;a++){
		arr1[a]=sc.nextInt();

		}


		for(b=0;b<10;b++){

				if(arr1[b]%2==0)
				{
					System.out.println("The Even numbers are " +arr1[b]);
					
					count++;
					

				}				
		
	}
	System.out.println("count " +count);

	}
}