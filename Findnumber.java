import java.util.*;

class Findnumber{
	public static void main(String[] args) {

		int[] i =new int [10];
		int a;
		Scanner sc = new Scanner(System.in);
		for(a=0;a<10;a++){
			
			i[a] = sc.nextInt();

		}
		int b = i[0];

		for(a =0; a<10; a++){
			b = i[a];
			System.out.println(b);
		}


		int c = sc.nextInt();
		
		for(a =0; a<10; a++){
			if(c == i[a]){


			break;			
		}
		
	}
		if (c==i[a]) {
			System.out.println("Number Found");
		}else
		{
			System.out.println("Not Found");
		}


		
	}
}