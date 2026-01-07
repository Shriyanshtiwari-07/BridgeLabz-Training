package com.oops.ewalletapplication;

public class EWalletApp {
	public static void main(String[] args) {
        
        User alice = new User("Nageshwar", new PersonalWallet(500.0, 50.0)); 
        User shop = new User("TechCorp", new BusinessWallet(10000.0, 0.0));

        System.out.println("Alice Balance before: $" + alice.getWallet().getBalance());
        
        ((Transferrable) alice.getWallet()).transferTo(shop, 200.0);

        System.out.println("Nageshwar Balance after: $" + alice.getWallet().getBalance());
        System.out.println("TechCorp Balance: $" + shop.getWallet().getBalance());

        alice.getWallet().viewHistory();
    }
}