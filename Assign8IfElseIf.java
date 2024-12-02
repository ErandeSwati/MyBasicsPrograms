package assignments;

import java.util.Scanner;

public class Assign8IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	//s	int n3=sc.nextInt();

		
		if(n1>n2)
		{
			System.out.println("N1 is the biggest number");
		}
		else if(n1<n2)
			{
			System.out.println("N2 is the biggest number");

			}
		else
		{
			System.out.println("both are equals number");
		}
			
	}

}
