import java.util.*;
class demo1
{
	public int a,b;
	public demo1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public void add()
	{
		System.out.println("Add="+(a+b));
	}
}

class testdemo1
{
	public static void main(String[] args) {
		
		demo1 d1=new demo1(20,10);
		d1.add();

	}
}
