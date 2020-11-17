package addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
	
		Scanner r =new Scanner(System.in);
		ArrayList<String> address=new ArrayList<String>();
		System.out.println("Enter 1st name");
		address.add(r.nextLine());
		System.out.println("Enter last name");
		address.add(r.nextLine());
		System.out.println("Enter city");
		address.add(r.nextLine());
		System.out.println("Enter state");
		address.add(r.nextLine());
		System.out.println("Enter Country");
		address.add(r.nextLine());
		System.out.println("Enter Zipcode");
		address.add(r.nextLine());
		System.out.println("The orignal address book is");
		System.out.println(address);

		System.out.println("Enter a number to perform the following operations\n 1.Change a person\n 2.Edit address info\n 3.Sorting Address book\n 4.Printing addressbook\n 5.Remove Person\n 6.Clear AddressBook\n 7.Exit program");
		Scanner sc=new Scanner(System.in);
		switch (sc.nextInt()) {

		case 1:
			System.out.println("1.Changing the person");
			System.out.println("Change 1st name");
			address.set(0,r.nextLine());
			System.out.println(address);
			break;
		case 2:
			System.out.println("2.Editing Address info");
			System.out.println("Change city");
			address.set(2,r.nextLine());
			System.out.println("Change State");
			address.set(3,r.nextLine());
			System.out.println("Change Zipcode");
			address.set(5,r.nextLine());
			System.out.println(address);
			break;
		case 3:
			System.out.println("3.Sorting Address Book");
			Collections.sort(address);
			for(String i:address) {
				System.out.println(i);
			}
				break;
		case 4:
			System.out.println("4.Printing Address Book ");
			 for (int i = 0; i < address.size(); i++) {
			      System.out.println(address.get(i));
			    }
			 break;
		case 5:
			System.out.println("5.Removing a Person");
			address.remove(0);
			address.remove(0);
			System.out.println(address);
			break;
		case 6:
			System.out.println("6.Clearing Address Book");
			address.clear();
			break;
		case 7:
			System.out.println("7.Exit Program");
			break;
		default:
			System.out.println("Error:Enter valid input");
			break;
			
		}
		
	}

}

