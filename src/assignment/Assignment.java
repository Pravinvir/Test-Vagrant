package assignment;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length");
		int len=sc.nextInt();
		String[] a=new String[len];
		
		while(true)
		{
		System.out.println("Enter a number");
		String b=sc.next();
		addElements(a,b);
		}
		
	}
	public static void addElements(String[] a,String b)
	{
		int len=a.length;
		System.out.println(len);
		if(a.length==0)
		{	
		a[len-1]=b;
		}
		else
		{ int i=0;
			for(i=0;i<len-1;i++)
			{
				a[i]=a[i+1];
			}
			a[i]=b;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}
