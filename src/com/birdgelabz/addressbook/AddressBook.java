package com.birdgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	// taking arraylist with class object and it will store the value dynamic
	private static ArrayList<PersonDetail> list = new ArrayList<PersonDetail>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		// creating the persondetail class object to add the person detail
		PersonDetail personDetail = addPerson();
		// person detail object give to the list
		list.add(personDetail);
		System.out.println("Welcome to the addressbook");
		System.out.print("Enter the choice 1.add 2.edit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			addPerson();
			break;
		case 2:
			editPersonDetail();
			break;
		}

	}

	/*
	 * addperson method is to take input from the console personDetail given as
	 * return type to the method as there are different type of parameter need to
	 * return the method
	 */
	private static PersonDetail addPerson() {
		System.out.println("Enter the firstname");
		String firstName = scanner.next();
		System.out.println("Enter the lastname");
		String lastName = scanner.next();
		System.out.println("Enter the address");
		String address = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the state");
		String state = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();
		System.out.println("Enter the zip");
		long zip = scanner.nextLong();
		System.out.println("Enter the phone of the person");
		long phone = scanner.nextLong();
		PersonDetail personDetail = new PersonDetail(firstName, lastName, address, city, state, email, zip, phone);
		return personDetail;
	}

	private static PersonDetail AddPerson() {
		System.out.println("Enter the firstname");
		String firstName = scanner.next();
		System.out.println("Enter the lastname");
		String lastName = scanner.next();
		System.out.println("Enter the address");
		String address = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the state");
		String state = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();
		System.out.println("Enter the zip");
		long zip = scanner.nextLong();
		System.out.println("Enter the phone of the person");
		long phone = scanner.nextLong();
		PersonDetail personDetail = new PersonDetail(firstName, lastName, address, city, state, email, zip, phone);
		return personDetail;
	}

	/**
	 * editpersonmethod to edit the person detail
	 */
	public static void editPersonDetail() {
		System.out.println("Enter the name to edit the addressbook");
		String editName = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().equals(editName)) {
				System.out.print("Enter the below data user need to eit the addresssbook");
				System.out.println("Press 1.firstname 2.lastname 3.address 4.city 5.state 6.email 7.zip 8.phone");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the fitsname");
					list.get(i).setFirstName(scanner.next());
					break;
				case 2:
					System.out.println("Enter the lastname");
					list.get(i).setLastName(scanner.next());
					break;
				case 3:
					System.out.println("Enter the address");
					list.get(i).setAddress(scanner.next());
					break;
				case 4:
					System.out.println("Enter the city");
					list.get(i).setCity(scanner.next());
					break;
				case 5:
					System.out.println("Enter the state");
					list.get(i).setState(scanner.next());
					break;
				case 6:
					System.out.println("Emter the email");
					list.get(i).setEmail(scanner.next());
					break;
				case 7:
					System.out.println("Enter the zip");
					list.get(i).setZip(scanner.nextInt());
					break;
				case 8:
					System.out.println("Enter the phone");
					list.get(i).setPhone(scanner.nextInt());
					break;
				}
			}
		}
	}

	/*
	 * Dispaly method is give to display the persom data personDetail class obejct
	 * give as the parametr to the Display method
	 */
	private static void display(PersonDetail personDetail) {
		System.out.println("firstname" + personDetail.getFirstName());
		System.out.println("lastname" + personDetail.getLastName());
		System.out.println("address" + personDetail.getAddress());
		System.out.println("city" + personDetail.getCity());
		System.out.println("state" + personDetail.getState());
		System.out.println("email" + personDetail.getEmail());
		System.out.println("zip" + personDetail.getZip());
		System.out.println("phone" + personDetail.getPhone());
	}

}
