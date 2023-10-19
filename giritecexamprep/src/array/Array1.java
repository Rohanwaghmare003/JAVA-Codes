package array;

import java.util.Scanner;



public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		
		int a [] = new int [5];
		
		int max = a[0];
		
		
		for(int  i =0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int  i =0; i<a.length; i++)
		{
			
		
			
			if(max<a[i])
			{
				max = (a[i]);
			}
			
		}
		System.out.println(max);

	}
}


