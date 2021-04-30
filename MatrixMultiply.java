import java.util.*;

class MatrixMultiply{

	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = {{10,20,30},{40,50,60},{70,80,90}};
		int [][] c= new int[3][3];
		int i,j,k,l,x=0,x1=0,x2=0;

		
		

		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
			
				c[i][j] +=a[i][k]*b[k][j];
	
		}		
		
	}

		
		
}	

for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}

}


}