package practice;

public class CallingNonStaticMethod {
	
	void a()
	{
		System.out.println(" Method a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingNonStaticMethod m =new CallingNonStaticMethod();
		m.a();
	}

}
