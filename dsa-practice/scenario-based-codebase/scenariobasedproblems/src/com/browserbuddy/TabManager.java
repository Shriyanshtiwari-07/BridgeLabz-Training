package com.browserbuddy;

import java.util.Stack;

public class TabManager {
    private Stack<BrowserTab> closedTabs;

    public TabManager() {
        closedTabs = new Stack<>();
    }

    // Close a tab
    public void closeTab(BrowserTab tab) {
        closedTabs.push(tab);
    }

    // Restore last closed tab
    public BrowserTab restoreTab() {
        if (!closedTabs.isEmpty()) {
            return closedTabs.pop();
        }
        return null;
    }
}
