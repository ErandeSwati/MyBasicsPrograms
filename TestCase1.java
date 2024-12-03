package practice;

class GetUrl
{
	GetUrl()
	{
		super();
		System.out.println(" URL");
	}
}
class LaunchBrowswer extends GetUrl
{
	LaunchBrowswer()
	{
		super();

		System.out.println(" Launch browser");
	}
}
public class TestCase1 extends LaunchBrowswer {

	 TestCase1()
	{	
			super();
		System.out.println("method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCase1 t=new TestCase1();
		//t.m1();
	}

}


