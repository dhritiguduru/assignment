package Assignment1;

import java.util.Scanner;

public class User {
	public static void add(Bean[]arr, int a) {
		Scanner s = new Scanner(System.in);
		System.out.println("Add a task: ");
		String t = s.next();
		Bean b = new Bean(a,t);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==null)
			{
				arr[i]= b;
				break;
			}
		}
		a++;
		
	}
	
	public static void update(Bean[] arr) {
		Scanner s = new Scanner(System.in);
		System.out.println("Update task: ");
		String t1 =s.next();
		System.out.println("New task: ");
		String t2 =s.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null && arr[i].getTaskName() ==t1) 
			{
				arr[i].setTaskName(t2);
				break;
			}
		}
		}
	public static void delete(Bean[]arr,int a) {
		Scanner s = new Scanner(System.in);
		System.out.println("Delete task: ");
		String t = s.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null && arr[i].getTaskName()==t)
			{
				arr[i]=null;
				break;
			}
		}
		a--;	
	}
	
	public static void search(Bean[]arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				System.out.println(arr[i].getTaskId());
				System.out.println(arr[i].getTaskName());
			}
		}
	}

}
