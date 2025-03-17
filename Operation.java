package oop.homework;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
            System.out.println("=".repeat(20));
            System.out.println("Wellcome to the Bank ATM");
            System.out.println("=".repeat(20));
            System.out.println("""
                    please choose the account type:
                    1. Saving Account
                    2. Credit Account
                    3. Exit
                    """);
            System.out.print("select Type of your Account : ");
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                        AccountImpl savingAccount = new AccountImpl("Saving Account");
                    while (true) {
                        System.out.println("=".repeat(20));
                        System.out.println("Saving Account");
                        System.out.println("=".repeat(20));
                        System.out.println("Your current balance USD is: " + savingAccount.getBalance()+"$");
                        if (savingAccount.getIsXchange()) {
                            System.out.println("Your current balance KHR is: " + savingAccount.getAmountToReil());
                        }
                        System.out.println("""
                                1. Deposit
                                2. Withdraw
                                3. exchange to Reil
                                4. exchange to Dollar
                                5. Exit
                                """);
                        System.out.print("select the operation: ");
                        switch (new Scanner(System.in).nextInt()) {
                            case 1 -> {
                                System.out.print("Deposit = ");
                                savingAccount.deposit(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 2 -> {
                                System.out.print("Withdraw = ");
                                savingAccount.withdraw(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 3 -> {
                                System.out.print("Please input amount to Exchange  = ");
                                savingAccount.exchangeToReil(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 4 -> {
                                System.out.print("Please input amount to Exchange = ");
                                savingAccount.exchangeToDollar(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 5 -> System.exit(0);
                        }
                    }
                }
                case 2 -> {
                    AccountImpl CreditAccount = new AccountImpl("Credit Account");
                    while (true) {
                        System.out.println("=".repeat(20));
                        System.out.println(CreditAccount.getName());
                        System.out.println("=".repeat(20));
                        System.out.println("Your current balance USD is: " + CreditAccount.getBalance() + "$");
                        if (CreditAccount.getIsXchange()) {
                            System.out.println("Your current balance KHR is: " + CreditAccount.getAmountToReil());
                        }
                        System.out.println("""
                                1. Deposit
                                2. Withdraw
                                3. exchange to Reil
                                4. exchange to Dollar
                                5. Exit
                                """);
                        switch (new Scanner(System.in).nextInt()) {
                            case 1 -> {
                                System.out.print("Deposit = ");
                                CreditAccount.deposit(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 2 -> {
                                System.out.print("Withdraw = ");
                                CreditAccount.withdraw(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 3 -> {
                                System.out.print("Exchange to Reil = ");
                                CreditAccount.exchangeToReil(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 4 -> {
                                System.out.print("Exchange to Dolla = ");
                                CreditAccount.exchangeToDollar(new Scanner(System.in).nextDouble());
                                new Scanner(System.in).nextLine();
                            }
                            case 5 -> System.exit(0);
                        }
                    }
                }
            }
        }
    }
