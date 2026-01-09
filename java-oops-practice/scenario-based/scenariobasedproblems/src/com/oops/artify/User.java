package com.oops.artify;

class User {
    String name;
    double walletBalance;

    User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    void deduct(double amount) {
        walletBalance -= amount;
    }
}
