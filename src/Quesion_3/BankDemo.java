package Quesion_3;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {

		String answer = null;
		double amount = 0;

		Account account = new Account("123");

		Scanner scn = new Scanner(System.in);

		do {

			System.out.println("Depositing Rs.10,000");
			account.deposit(10000);

			try {

				while (true) {
					System.out.println();
					System.out.print("Please enter amount to be withdrawn = ");
					amount = scn.nextDouble();
					account.withdraw(amount);
					System.out.println("Withdrawing " + amount + "/=");
					System.out.println("Existing amount is: " + account.getBalance());
				}

			} catch (InsufficientBalanceException e) {
				System.out.println("Sorry, your account remains only Rs. " + e.getAmount());
				e.printStackTrace();

			} finally {
				
				scn.nextLine();
				System.out.println("Do you wish to continue?(yes/no) ");
				answer = scn.next();
			}

		} while (answer.equalsIgnoreCase("yes"));

	}

}
