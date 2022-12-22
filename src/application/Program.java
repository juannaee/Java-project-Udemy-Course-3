package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Account acc = new Account(null, null, 0.0);

		System.out.println("Qntidade");
		Double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		
		System.out.println("Qntidade");
		Double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);

		System.out.println(acc);

		sc.close();

	}

}
