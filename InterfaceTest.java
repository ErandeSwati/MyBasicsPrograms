package practice;

public class InterfaceTest implements I1,I2{

	
	public static void main(String[] args) {
        InterfaceTest t = new InterfaceTest();
        t.show();
        t.add();
        I1.b();
        I1 v=new InterfaceTest();
        
    }

    @Override
    public void show() {
        System.out.println("Show");
    }

  //  @Override
  //  public void add() {
        // You can call the default add method from I1
    //    I1.super.add();
   // }
}

interface I1 {
    void show();
    
    // Default method to provide the implementation for add
    default void add() {
    	//a();
        System.out.println("ADD");
    }
    private void a()
    {
    	
    	System.out.println("hello");
    }
    static void b()
    {
    	System.out.println("Static");
    }
}

interface I2 {
    void show();
}