package com.ambulanceroute;

public class HospitalUnitNode {
    String unitName;
    boolean available;
    HospitalUnitNode next;

    public HospitalUnitNode(String unitName, boolean available) {
        this.unitName = unitName;
        this.available = available;
        this.next = null;
    }
}