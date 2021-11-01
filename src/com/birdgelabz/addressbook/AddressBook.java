package com.birdgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	// taking arraylist with class object and it will store the value dynamic
    private static ArrayList<PersonDetail> list = new ArrayList<PersonDetail>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        //creating the persondetail class object to add the person detail
        PersonDetail personDetail = addPerson();
        // person detail object give to the list
        list.add(personDetail);
        for (int i=0;i<list.size();i++){
           AddressBook.display(list.get(i)); //display method take the input as list and print the data
        }

    }
    /* addperson method is to take input from the console
    personDetail given as return type to the method as there are different type of parameter need to return the method
     */
    private static PersonDetail addPerson(){
        System.out.println("Enter the firstname");
        String firstName= scanner.next();
        System.out.println("Enter the lastname");
        String lastName= scanner.next();
        System.out.println("Enter the address");
        String address= scanner.next();
        System.out.println("Enter the city");
        String city= scanner.next();
        System.out.println("Enter the state");
        String state= scanner.next();
        System.out.println("Enter the email");
        String email= scanner.next();
        System.out.println("Enter the zip");
        long zip= scanner.nextLong();
        System.out.println("Enter the phone of the person");
        long phone= scanner.nextLong();
        PersonDetail personDetail= new PersonDetail(firstName,lastName,address,city,state,email,zip,phone);
        return personDetail;
    }
    /* Dispaly method is give to display the persom data
    personDetail class obejct give as the parametr to the Display method
     */
    private static void display(PersonDetail personDetail){
        System.out.println("firstname"+ personDetail.getFirstName());
        System.out.println("lastname"+personDetail.getLastName());
        System.out.println("address"+personDetail.getAddress());
        System.out.println("city"+personDetail.getCity());
        System.out.println("state"+personDetail.getState());
        System.out.println("email"+ personDetail.getEmail());
        System.out.println("zip"+ personDetail.getZip());
        System.out.println("phone"+personDetail.getPhone());
    }

}


