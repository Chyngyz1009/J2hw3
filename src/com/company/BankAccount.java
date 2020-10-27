package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы положили " + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств ", getAmount());
        }
        amount = amount - sum;
        System.out.println("Вы сняли " + sum);
    }
}
