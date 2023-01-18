package Assignment1;

import java.util.Scanner;

class Task{
	String task1;
	String task2;
	String task3;
	
	Scanner s = new Scanner(System.in);
	
	void choice() {
		
		
	System.out.println("Please enter your choice: \n1. Enter your task \n2. Show all tasks");
	int i = s.nextInt();

	
	if(i==1) {
		System.out.println("Please enter your tasks ");
		task1 = s.next();
		
		task2 = s.next();
		
		task3 = s.next();
		}
	else if(i==2){
	System.out.println(" These are your tasks ");
	
	System.out.println("1: "+task1);
	System.out.println("2: "+task2);
	System.out.println("3: "+task3);
	
	}
	else {
		System.out.println("Enter valid choice");
	}
	}
	
}

public class ToDoManager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = s.next();
		System.out.println("Enter number of Tasks : ");
		
		
		for(int a =s.nextInt(); a>=3;a++)
		{
		Task t= new Task();
		 t.choice();
		}
		}

}
