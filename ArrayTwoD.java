import java.util.*;

class ArrayTwoD{
	
	public static void main(String[] args) {
		int [][] a = new int [3][6];

		int [][] b ={{1,2,3},{4,5,6},{7,8,9}};
		for(int k=0;k<3;k++)
		{
		for(int l=0;l<3;l++)
		{
			System.out.print("\t "+b[k][l]);
		}
		System.out.println();
	}

		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of array");

		for(i=0;i<3;i++){
			for(j=0;j<6;j++){

				a[i][j]=sc.nextInt();
		}
	}
	System.out.println(" array Value :");
	for(i=0;i<3;i++){
		for(j=0;j<6;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
	}

	for(int k=0;k<3;k++){
		for(int l=0;l<3;l++){
			System.out.println(" The second array is "+b[k][l]);
		}
		System.out.println();
	}

	
	
}
}