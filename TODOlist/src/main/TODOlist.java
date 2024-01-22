package main;
import java.util.*;
import java.io.*;

public class TODOlist {
	static File myFile = new File("TODO.txt");
	
	public static void main(String[] args) throws IOException {
//		if (myFile.createNewFile()) {
//			System.out.println("ya");
//		} else {
//			System.out.println("na");
//		}	
		mainMenu();

	}

	static void again() {
		System.out.print("Again (y or n)? ");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		
		if (choice.equals("y")) {
			mainMenu();
		}
		
	}
	
	static void mainMenu() {
		System.out.println("\nMain Menu\n"
				+ "0 Display Tasks\n"
				+ "1 Add Tasks\n"
				+ "2 Mark Tasks as COMPLETE\n"
				+ "3 Delete Tasks\n"
				+ "4 Exit Program...\n");
		
		System.out.print("Enter a choice: ");
		Scanner myObj = new Scanner(System.in);
		int myChoice = myObj.nextInt();
		
		while (myChoice != 4 ) {
			if (myChoice == 0) {
				displayList();
			} else if (myChoice == 1) {
				addTask();
			} else if (myChoice == 2) {
				markTask();
			} else if (myChoice == 3) {
				deleteTask();
			}else {
				System.out.println("Invalid input, try again. \n");
				mainMenu();
			}
			again();
			break;
		}
	}
	
	static void displayList() {
		System.out.println("\nTo-do List");
		try {
			Scanner inFile = new Scanner(new FileReader(myFile));
			int num = 1;
			while (inFile.hasNextLine()) {
				String line = inFile.nextLine();
				System.out.println(num + " " + line);
				num++;
			}
			System.out.println();
			inFile.close();
		} catch (IOException ioe) {
			System.out.println("Can't access file.");
		}
	}
	
	static void addTask() {
		System.out.println("\nAdd Task");
		try {
			Scanner input = new Scanner(System.in);
			PrintWriter outFile = new PrintWriter(new FileWriter(myFile, true));
			System.out.print("Enter task: ");
			String task = input.nextLine();
			outFile.println(task);
			outFile.close();
		} catch (IOException ioe) {
			System.out.println("Can't access file.");
		}
	}
	
	static void markTask() {
		displayList();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter task number to mark as COMPLETED: ");
		int taskNum = input.nextInt();
		ArrayList<String> items = new ArrayList<String>();
		int num = 1;
		try {
			Scanner inFile = new Scanner(new FileReader(myFile));
			while (inFile.hasNextLine()) {
				String item = inFile.nextLine();
				if (num != taskNum) {
					items.add(item);
				} else {
					items.add(item + " -- COMPLETED");
				}
				++num;
			}
			PrintWriter outFile = new PrintWriter(new FileWriter(myFile));
			for(int i = 0; i < items.size(); ++i) {
				outFile.println(items.get(i));
			}
			outFile.close();
		} catch (IOException ioe) {
			System.out.println("Can't access file. ");
		}
	}
	
	static void deleteTask() {
		displayList();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter task number to remove: ");
		int taskNum = input.nextInt();
		ArrayList<String> items = new ArrayList<String>();
		int num = 1;
		try {
			Scanner inFile = new Scanner(new FileReader(myFile));
			while (inFile.hasNextLine()) {
				String item = inFile.nextLine();
				if (num != taskNum) {
					items.add(item);
				}
				++num;
			}
			PrintWriter outFile = new PrintWriter(new FileWriter(myFile));
			for(int i = 0; i < items.size(); ++i) {
				outFile.println(items.get(i));
			}
			outFile.close();
		} catch (IOException ioe) {
			System.out.println("Can't access file. "); 
		}
	}
}
