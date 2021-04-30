import java.util.*;

class ReplaceNumber{
	public static void main(String[] args) {

		int[] i =new int [10];
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array ");
		for(a=0;a<5;a++){
			
			i[a] = sc.nextInt();

		}

		System.out.println("The repeated array is ");

		for(a =0; a<5; a++){
			
			System.out.println(i[a]);
		}

		

		System.out.println("Enter a number to search in the above array");
		int c = sc.nextInt();
		
		for(a =0; a<5; a++){
			if(i[a]==c){


			break;			
		}
		
	}
		if (c==i[a]) {


			System.out.println("Number Found");
			System.out.println("array index is "+a);
			System.out.println("Enter an Number to replace the array index");

			int d = sc.nextInt();
			i[a]=d;
			System.out.println("The new array ");
			for(a =0; a<5; a++){
			
			System.out.println(i[a]);
			}

		}
		else
		{
			System.out.println("Not Found");
		}
	}
}