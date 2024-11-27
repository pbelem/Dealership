package dealership.util;

import java.util.Scanner;

import dealership.util.operations.DeleteOperation;
import dealership.util.operations.RegisterOperation;
import dealership.util.operations.SelectOperation;
import dealership.util.operations.UpdateOperation;
import dealership.util.operations.ViewOperation;

public class ChooseOperation {

	public static void chooseOperation() {

		Scanner sc = new Scanner(System.in);

		for (boolean I = true; I;) {

			System.out.println("Which operation do you want to do?");
			System.out.println("1 - Enter data");
			System.out.println("2 - Consult Data");
			System.out.println("3 - Update data");
			System.out.println("4 - Delete data");
			System.out.println("5 - History");
			System.out.println("6 - Close Program");

			switch (sc.nextInt()) {
			case 1:
				RegisterOperation.registerOperation();
				break;
			case 2:
				DeleteOperation.deleteOperation();
				break;
			case 3:
				SelectOperation.selectOperation();
				break;
			case 4:
				UpdateOperation.updateOperation();
				break;
			case 5:
				ViewOperation.viewOperation();
				break;
			case 6:
				I = false;
				break;
			default:
				System.out.print("Invalid option! Please choose again\n");
			}
		}
		System.out.println("Program closed");
		
	}
}
