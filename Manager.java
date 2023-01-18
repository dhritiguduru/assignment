package Assignment1;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		Bean[] arr=new Bean[50];
		int size=0;
		Scanner s = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("****Menu*****");
			System.out.println("1.Add a task");
			System.out.println("2.Update a task");
			System.out.println("3.Delete a task");
			System.out.println("4.Search for a task");
			System.out.println("Please enter your choice");
			choice =s.nextInt();
			
			switch(choice)
			{
			case 1: 
				User.add(arr,size);
				System.out.println("Task Added ");
				break;
				
			case 2:
				User.update(arr);
				System.out.println("Task updated");
				break;
			
			case 3:
				User.delete(arr, size);
				System.out.println("Task deleted");
			
			case 4:
				User.search(arr);
				System.out.println("Required task");
			case 0:
				System.out.println("EXIT");
				
			
			}
			
		}
		while(choice!=0);
		

	}

}
