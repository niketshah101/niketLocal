import java.util.*;

class Series1{
		
		public static void main(String[] args) {
			int f;
			int s=0;
			int n;

			for(f=0;f<100;f++){
				
				n=f+s;
				s=f;
				System.out.println(n);

			}

		}
}