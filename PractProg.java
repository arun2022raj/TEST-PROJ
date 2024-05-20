package com.practice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Math;

public class PractProg
{
	public static int fact(int n)
	{
		int factorial=1;
		for (int i=n;i>0;i--)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	public static boolean isPrime(int n){
		if (n<=1)
		{
			System.out.println("enter a valid number more than 1");
			return false;
		}
		if(n==2){
			return true;
		}
		for (int i=2;i<Math.sqrt(n);i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void reverseArray(int... arr)
	{
		for (int i=arr.length - 1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int smallarrele(int... arr)
	{
		int small=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if (arr[i]<small)
			{
				small=arr[i];
			}
		}
		return small;
	}
	public static int largearrele(int... arr)
	{
		int large=0;
		for (int i=1;i<arr.length;i++)
		{
			if (arr[i]>large)
			{
				large=arr[i];
			}
		}
		return large;
	}
	public static String revstring(String str)
	{
		String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revstr=revstr+str.charAt(i);
		}
		return revstr;
	}
	public static int sumdigit(int num)
	{
		int sum=0;
		int rem=0;
		while (num>0)
		{
			rem=(int) num%10;
			sum=sum+rem;
			num=(int) num/10;
		}
		return sum;
	}
	public static boolean polindrome(String str)
	{
		int len=str.length()-1;
		for (int i=0;i<(int) str.length()/2;i++)
		{
			if (str.charAt(i) != str.charAt(len-i))
			{
				return false;
			}
		}
		return true;
	}
	public static void fibonacci(int num)
	{
		int first=0;
		int second=1;
		int next;
		if (num<=0)
		{
			System.out.println("enter a digit greater than 0");
		}
		else if (num==1)
		{
			System.out.print(first+" ");
		}
		else if (num==2)
		{
			System.out.print(first+" ");
			System.out.print(second+" ");
		}
		else
		{
			System.out.print(first+" ");
			System.out.print(second+" ");
			for (int i=0;i<num-2;i++)
			{
				next=first+second;
				System.out.print(next+" ");
				first=second;
				second=next;
			}
		}
		
	}
	public static int[] sortarray(int[] arr)
	{
		
		int len=arr.length;
		int temp=0;
		for (int i=0;i<len;i++)
		{
			for (int j=i;j<len;j++)
			{
				if (arr[j]<arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter a number for finding factorial");
		// int k=sc.nextInt();
		// System.out.println(String.format("factorial of a given number %d is %d",k,fact(k)));
		// System.out.println("Please enter a number to find it is prime of not");
		// k=sc.nextInt();
		if (isPrime(k))
		{
			System.out.println(String.format("the given number %d is %z is prime",k));
		}
		else
		{
			System.out.println(String.format("the given number %d is not prime",k));			
		}
		// System.out.println("enter size of an array");
		// int size = sc.nextInt();
		// int[] arr=new int[size];
		int ele;
		// System.out.println("enter elements one by one");
		// for (int i=0;i<size;i++)
		// {
			// ele=sc.nextInt();
			// arr[i]=ele;
		// }
		// System.out.println("reverse of an array");
		// reverseArray(arr);
		// System.out.println("\nsmallest element in array "+smallarrele(arr));
		// System.out.println("smallest element in array "+largearrele(arr));
		// System.out.println("enter string to reverse");
		// String reqstrtorev=sc.nextLine();
		// sc.nextInt();
		// System.out.println("the reversed string of your string is");
		// System.out.println(revstring(reqstrtorev));
		// System.out.println("enter a number to sum the digits");
		// int numdig=sc.nextInt();
		// System.out.println("sum of the digits of the given number is "+sumdigit(numdig));
		// System.out.println("enter the string to check polindrome or not");
		// String norstr=sc.next();
		// if (polindrome(norstr))
		// {
			// System.out.println("string is polindrome");
		// }
		// else{
			// System.out.println("string is not polindrome");
		// }
		// System.out.println("enter number of fibonnaci digits required");
		// int reqfib=sc.nextInt();
		// System.out.println(String.format("fibonacci series untill %d is :",reqfib));
		// fibonacci(reqfib);
		System.out.println("enter array size");
		int arrsize=sc.nextInt();
		int[] arrtosort=new int[arrsize];
		for (int i=0;i<arrsize;i++)
		{
			ele=sc.nextInt();
			arrtosort[i]=ele;
		}
		int[] sortedarr=sortarray(arrtosort);
		System.out.println(Arrays.toString(sortedarr));
		
		
		
		
		
		
		
		
		
		
	}
}