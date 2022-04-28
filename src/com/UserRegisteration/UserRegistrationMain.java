package com.UserRegisteration;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		UserRegister registration = new UserRegister();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		registration.validateFirstName(firstName);

		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		registration.validateLastName(lastName);

		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		registration.validateEmail(email);

		System.out.println("Enter Phone-Number");
		String number = sc.nextLine();
		registration.validatePhoneNumber(number);

		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		registration.validatePassword(password);

		registration.register();
		sc.close();
	}
}
