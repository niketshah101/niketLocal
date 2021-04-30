import java.util.*;

class FindSeries{
	public static void main(String[] args) {
		

		int a = 0;
		int b = 1;
		int c , d, k;
		int m[]=new int [14];
		int m1[]=new int[7];
		int m2[]=new int[7];
		System.out.println("The EBO sereis is ");
		int f=0,n;
		for(k=1;k<8;k++){
			n=a+b;
			a=b;
			b=n;
			System.out.println(a);
			m1[f]=a;
			f++;
		}

		System.out.println("The prime number is ");
		int p=0;
		for(c=2;c<19;c++){
			
			for(d=2;d<c;d++){
				if(c%d ==0){
					break;
				}
			}
			if(d==c){
				System.out.println(d);
				m2[p]=c;
				p++;
			}
		}
		f=0;
		p=0;
					System.out.println("Series:");
		for(n=0; n<14 ; n++){
		if(n%2==0)
		{
			m[n]=m1[f];
			f++;
		}
		else
		{
			m[n]=m2[p];
			p++;
		}
		System.out.println(m[n]);
	}


}
}