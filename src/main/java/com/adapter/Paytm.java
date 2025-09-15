package com.adapter;

public class Paytm {
    public static void main(String[] args) {

        BankAPI api = new ybAdapter();
        System.out.println(api.fetchBalance("123456"));

        System.out.println(api.transferAmount("123456", "123456666", 100));

    }


}
