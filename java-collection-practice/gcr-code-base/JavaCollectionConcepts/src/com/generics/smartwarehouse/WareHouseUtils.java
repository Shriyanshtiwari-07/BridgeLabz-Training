package com.generics.smartwarehouse;

import java.util.List;

public class WareHouseUtils {

    public static void displayItems(List<? extends WareHouseItem> items) {
        for (WareHouseItem item : items) {
            System.out.println(item);
        }
    }
}