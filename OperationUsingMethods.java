package practice;

public class OperationUsingMethods {
	static int a=4;
	static int b=2;
	
	static void sum()
	{
		int sum=a+b;
		System.out.println(sum);

	}
	static void sub()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	static void mul()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int div=a/b;
		System.out.println(div);
	}
	static void mod()
	{
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sub();
		mul();
		div();
		mod();
		
	}

}
