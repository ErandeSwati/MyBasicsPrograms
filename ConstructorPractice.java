package practice;

public class ConstructorPractice {

	private int aa;
	ConstructorPractice()
	{
		System.out.println("Default");
	}
	
	public ConstructorPractice(int a)
	{
		System.out.println("Public");
	}
	private ConstructorPractice(String c,int d)
	{
		System.out.println("private");
	}
	protected ConstructorPractice(String age,String name)
	{
		System.out.println("protected");
	}
	void normalMethod()
	{
		System.out.println("normal method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice a=new ConstructorPractice();
		int aa = 0 ;
		String bb;
		a.normalMethod();
		
		ConstructorPractice b=new ConstructorPractice(aa);
		b.normalMethod();
		ConstructorPractice c=new ConstructorPractice("20",30);
		c.normalMethod();
		ConstructorPractice d=new ConstructorPractice("40","50");
		d.normalMethod();
		b.aa=10;
		System.out.println("value:"+ b.aa);
	}

}
