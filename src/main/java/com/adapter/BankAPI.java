package com.adapter;

public interface BankAPI {
    int fetchBalance(String accountNo);


    boolean transferAmount(String fromAcc, String toAcc, int amount);

}
