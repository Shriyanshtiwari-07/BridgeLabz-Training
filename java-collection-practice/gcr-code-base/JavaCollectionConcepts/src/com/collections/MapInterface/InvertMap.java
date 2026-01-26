package com.collections.MapInterface;

import java.util.*;

public class InvertMap {
	public static <K,V> Map<V, List<K>> invertMap(Map<K,V> map){
		Map<V, List<K>> invertedMap = new HashMap<>();
		
		for(Map.Entry<K,V> entry: map.entrySet()) {
			K key = entry.getKey();
            V value = entry.getValue();

            invertedMap
                .computeIfAbsent(value, v -> new ArrayList<>())
                .add(key);
		}
		return invertedMap;
	}
	public static void main(String[] args) {
		Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        Map<Integer, List<String>> output = invertMap(input);

        System.out.println(output);
	}
}