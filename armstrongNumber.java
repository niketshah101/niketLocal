import java.util.*;

class armstrongNumber{

	public static void main(String[] args) {
		
		

		int armstrongNumber;
		int dig=0;
		int rem=0;
		int remdig2 =0;
		int dig2 = 0;

		int sum;
		
		Scanner sc =new Scanner(System.in);
		armstrongNumber=sc.nextInt();



		dig = armstrongNumber%10;   //153 = 153%10 = 3
		rem = (armstrongNumber-dig)/10;  //153
		remdig2 = rem%10;
		dig2 = (rem-remdig2)/10;

		

		int dig3 = dig*dig*dig;
		int remdig23 = remdig2*remdig2*remdig2;
		int dig23 = dig2*dig2*dig2;

		sum = dig3+remdig23+dig23;

		System.out.println(sum);
		
	}
}
