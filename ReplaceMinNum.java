import java.util.*;

class ReplaceMinNum{
	
	public static void main(String[] args) {
		
		int [][]a = {{1,5},{12,41,13,15,656,96,98574,7854,555}};
		int i,j,k,l,firstNumber,Replace;
	System.out.println("Enter a array position " );
		Scanner sc =new Scanner(System.in);
		firstNumber=sc.nextInt();
	

		for(i=0;i<2;i++){
			

			for(j=0;j<a[i].length;j++){

					for(k=0;k<a[j].length;k++){

							if(k==firstNumber){

								System.out.println("Enter a number to replace " );
								Replace =sc.nextInt();

								a[j][k] = Replace;


							}

System.out.println(a[j][k]);
				

			}
		}

	}

}}