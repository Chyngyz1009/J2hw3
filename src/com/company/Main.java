package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            System.out.println("Ваш счет " + bankAccount.getAmount());
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("У вас только " + bankAccount.getAmount());
                System.out.println(bankAccount.getAmount() - bankAccount.getAmount());
                break;
            }
        }
    }
}
