package com.exerciseThreePointOneOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("me",0.00);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String accountName = input.nextLine();

        System.out.println("Enter an amount to deposit: ");
        double depositAmount = input.nextDouble();

        System.out.println("Enter an amount to withdraw: ");
        double withdrawalAmount = input.nextDouble();

        System.out.println(account.getAccountName() + "Your current account balance is " + account.getAccountBalance());

    }

}
