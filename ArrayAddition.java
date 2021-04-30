import java.util.*;

class ArrayAddition{
	public static void main(String[] args) {
		
		int arr1[]= new int[10];
		int arr2[]= new int[10];
		int sum[]= new int[10];
		int a=0,b=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array 1");

		for(a=0;a<10;a++){
		arr1[a]=sc.nextInt();

		}

		System.out.println("Enter array 2");
		for(b=0;b<10;b++){
		arr2[b]=sc.nextInt();
		}

		for(b=0;b<10;b++){


		sum[b]=arr1[b]+arr2[b];
			System.out.println("The addition is"+sum[b]);
	}
	}
}