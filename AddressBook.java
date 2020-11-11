package addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
	
		ArrayList<String> address=new ArrayList<String>();
		address.add("Rajas");
		address.add("Dongre");
		address.add("Mumbai");
		address.add("Maharshtra");
		address.add("India");
		address.add("400092");
		System.out.println("The orignal address book is");
		System.out.println(address);

		System.out.println("Enter a number to perform the following operations\n 1.Change a person\n 2.Edit address info\n 3.Sorting Address book\n 4.Printing addressbook\n 5.Remove Person\n 6.Clear AddressBook\n 7.Exit program");
		Scanner sc=new Scanner(System.in);
		switch (sc.nextInt()) {

		case 1:
			System.out.println("1.Changing the person");
			address.set(0,"Ramesh");
			System.out.println(address);
			break;
		case 2:
			System.out.println("2.Editing Address info");
			address.set(2,"pune");
			address.set(3,"Mahrastra");
			address.set(5,"300081");
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

