import java.util.*;

class mainArray{


	public int [][] a=  {{1,2,3},{4,5,6},{7,8,9}};
	public int i,j,c=0;
	public int ValueChange;
	Scanner sc = new Scanner(System.in);	
}


class child1Transpose extends mainArray{

	public void transpose(){
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			a[i][j]=a[j][i];

			System.out.print(a[i][j]);

		}
		System.out.println();
	}

}
}


class child1max extends child1Transpose{

	public void findMax(){
		c=a[0][0];
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){


		if(c<a[i][j]){

			c=a[i][j];
		
		}
		
		
	}
}
System.out.print(c);}}


class child1TakeValue extends child1max{

	public void TakeValue(){
		
		System.out.println("Enter a value to replace");
		
		ValueChange = sc.nextInt();

	}
}

class child1ReplaceValue extends child1TakeValue{
	public void ReplaceValue(){


	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			if(c==a[i][j]){

				


				System.out.println(i);
				System.out.println(j);
				a[i][j]=ValueChange;
					
			}
		}
	}
}
}

class child1PrintArray extends child1ReplaceValue{
	public void PrintArray(){
		System.out.println("The new array is ");
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){


		
		System.out.print(a[i][j]);
		}
		System.out.println();
			
	}
}}



class child2elementsquare extends mainArray{

	public void square(){

		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
			a[i][j]=a[i][j]*a[i][j];
				
		}
}}}

class child2display extends child2elementsquare{

	public void display(){
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){

			System.out.print(a[i][j]);	
	}System.out.println();

}}}

class child2Add extends child2display{

	public void Add(){
		int d = a[0][0];
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				d+=a[i][j];
		}
	}System.out.println("The addition of all array elements is "+d);
}}

class child2multi extends child2display{

	public void multi(){
		int d = a[0][0];
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				d*=a[i][j];
		}
	}System.out.println("The multiplication of all array elements is "+d);
}}



class child2min extends child2elementsquare{
	public void min(){
	c = a[0][0];
	for(i=0;i<3;i++){
		for (j=0;j<3 ;j++ ) {
			if(c>a[i][j]){
				c=a[i][j];
			}
		}
		
	
}
System.out.println(c);
}}

class child2sum extends child2min{

	public void sum(){
		int d=a[0][0];
		for(i=0;i<3;i++){
			for (j=0;j<3;j++){
				d+=a[i][j];
				
			}
			
		}System.out.println("The sum is "+d);
	}
}
class finalInherit{

	public static void main(String[] args) {
		child1PrintArray c1 = new child1PrintArray();
		
		System.out.println("The Transpose is ");	
		c1.transpose();
		System.out.println("The max number is ");	
		c1.findMax();
		System.out.println();	
		c1.TakeValue();	
		c1.ReplaceValue();
		c1.PrintArray();
		child2sum c2 = new child2sum();
		System.out.println("The Square Array is");	
		c2.square();
		System.out.println("The minimum number is ");	
		c2.min();
		c2.sum();
		child2multi c3 = new child2multi();
		c3.multi();

		child2Add c4 = new child2Add();
		c4.display();
		c4.Add();
}}