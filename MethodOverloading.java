package practice;

public class MethodOverloading {
static char ab;
	void add(int a)
	{
		System.out.println(a+10);
	}
	void add(double a)
	{
		System.out.println(a+100);

	}
	static void add(String a)
	{
		System.out.println(a+100);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.add(10);
		m.add(1.2);
		add("Swati ");
		
		//static int h=10;
		System.out.println(ab);
	}

}
