import java.util.*;

class ar1
{
	public static void main(String[] args) {

		int[] a={10,20,3,55};

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);

		int[] b=new int[2];	

		int[] c=new int[5];
		System.out.println("enter value of array");

		Scanner sc =new Scanner(System.in);

		b[0]=sc.nextInt();

		
		int i;

		for(i=0;i<5;i++)
		{
			c[i]=sc.nextInt();
		}
		System.out.println("value of array");
		for(i=0;i<5;i++)
		{
			System.out.println(c[i]);
		}
			
	}
}