package javapatterns.Arrays;
import java.util.*;

class Printarray
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the size of the array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("enter the elements of the array");
		for (int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("elements of the array");
		for (int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
