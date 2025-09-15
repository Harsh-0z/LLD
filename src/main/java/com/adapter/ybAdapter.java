package com.adapter;

public class ybAdapter implements BankAPI{


    yesBank yb =  new yesBank();
    @Override
    public int fetchBalance(String accountNo) {
        return yb.checkBalance(accountNo);
    }

    @Override
    public boolean transferAmount(String fromAcc, String toAcc, int amount) {
        return yb.transferMoney(fromAcc, toAcc, amount);
    }


}
