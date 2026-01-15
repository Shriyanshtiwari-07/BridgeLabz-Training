package com.browserbuddy;

public class BrowserTab {
    private HistoryNode current;

    public BrowserTab(String homepage) {
        current = new HistoryNode(homepage);
    }

    // Visit a new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);
        current.next = newNode;
        newNode.prev = current;
        current = newNode;
    }

    // Go back
    public String back() {
        if (current.prev != null) {
            current = current.prev;
        }
        return current.url;
    }

    // Go forward
    public String forward() {
        if (current.next != null) {
            current = current.next;
        }
        return current.url;
    }

    public String getCurrentPage() {
        return current.url;
    }
}
