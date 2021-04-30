import java.util.*;
class number
{
	public int a,b;
	public void get()
	{
		System.out.println("ENter value of a and b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
}

class add extends number
{
	public void sum()
	{
		System.out.println("Sum="+(a+b));
	}
}


class product extends number
{
	public void multi()
	{
		System.out.println("Multiplication="+(a*b));
	}
}


class diff extends number
{
	public void sub()
	{
		System.out.println("Substraction="+(a-b));
	}
}

class testnumber
{
	public static void main(String[] args) {
		add a1=new add();
		a1.get();
		a1.sum();

		product p1=new product();
		p1.get();
		p1.multi();

		diff d1=new diff();
		d1.get();
		d1.sub();
	}
}


