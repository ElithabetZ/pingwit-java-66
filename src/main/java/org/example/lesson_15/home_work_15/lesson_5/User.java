package org.example.lesson_15.home_work_15.lesson_5;

public class User {

    private String name;
    private int sumOnBankAccount;

    public User(String name, int sumOnBankAccount) {
        this.name = name;
        this.sumOnBankAccount = sumOnBankAccount;
    }

    public void withDraw(int sum) throws InsufficientFundsException {
        if (sum > this.sumOnBankAccount) {
            throw new InsufficientFundsException("You are trying to withdraw more than you have in your account", this.sumOnBankAccount);
        } else {
            this.sumOnBankAccount -= sum;
            System.out.println("The operation was successful. Your balanse now " + this.sumOnBankAccount);
        }
    }
}
