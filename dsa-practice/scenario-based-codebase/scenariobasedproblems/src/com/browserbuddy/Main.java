package com.browserbuddy;

public class Main {
    public static void main(String[] args) {

        TabManager manager = new TabManager();

        BrowserTab tab1 = new BrowserTab("google.com");
        tab1.visit("github.com");
        tab1.visit("stackoverflow.com");

        System.out.println(tab1.back());     // github.com
        System.out.println(tab1.forward());  // stackoverflow.com

        // Close tab
        manager.closeTab(tab1);

        // Restore tab
        BrowserTab restoredTab = manager.restoreTab();
        System.out.println(restoredTab.getCurrentPage()); // stackoverflow.com
    }
}