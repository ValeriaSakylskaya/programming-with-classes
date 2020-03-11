package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client {
    private String name;
    private ArrayList<Account> accounts = new ArrayList();

    Client(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void searchAccount(String nameAccount) {
        for (Account ac : this.accounts) {
            if (ac.getNumberAccount() == nameAccount)
                System.out.println(ac.toString());
        }
    }

    public void SortAccount() {
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account z1, Account z2) {
                String s1 = z1.getNumberAccount();
                String s2 = z2.getNumberAccount();
                return s1.compareToIgnoreCase(s2);
            }
        });
    }

    public double sumAllBalance() {
        double sum = 0;
        for (Account ac : this.accounts) {
            sum = sum + ac.getBalance();
        }
        return sum;
    }

    public double sumPositiveBalance() {
        double sum = 0;
        for (Account ac : this.accounts) {
            if (ac.getBalance() > 0)
                sum = sum + ac.getBalance();
        }
        return sum;
    }

    public double sumNegativeBalance() {
        double sum = 0;
        for (Account ac : this.accounts) {
            if (ac.getBalance() < 0)
                sum = sum + ac.getBalance();
        }
        return sum;
    }
}