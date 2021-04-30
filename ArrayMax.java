import java.util.*;



class ArrayMax{

	public static void main(String[] args) {
		
		int[] i =new int [5];
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter value of array");
		for(int a=0; a<5; a++){
				i[a]=sc.nextInt();
			}
		int b=i[0];
		



			for(int a=1; a<5; a++){
				
				if(b<i[a]){
					b=i[a];
				}}
				
				System.out.println("max is "+b);
				
			}

			

			
		


	}

