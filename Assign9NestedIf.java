package assignments;

import java.util.Scanner;

public class Assign9NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
	//	int n2=sc.nextInt();
	//s	int n3=sc.nextInt();

		
		if(n1>=0 && n1<=100)
		{
			if(n1>=90)
			System.out.println("Grade a");
		
			if(n1>=35)
			{
			System.out.println("Fails");

			}
		
		}
		else
		{
			System.out.println("both are equals number");
		}
	}

}
