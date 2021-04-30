import java.util.*;


class Ascending{
	public static void main(String[] args) {
		int[] a = {1,8,6,5,2,4,7};

		int[] b = new int[a.length];
		int i,j;
		int c=0;
		int d;

		
			

				for(i=1;i<a.length;i++){
					{for(j=i+1;j<a.length;j++){


					if(a[j]>a[i])
						{
							c=a[i];
							a[i]=a[j];
							a[j]=c;
						
						}
					}
					System.out.println(a[i]);
			}		
			

}

	}}