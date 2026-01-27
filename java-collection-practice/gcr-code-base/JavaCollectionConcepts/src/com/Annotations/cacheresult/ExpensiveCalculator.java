package com.Annotations.cacheresult;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ExpensiveCalculator {

    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int square(int n) throws Exception {
        if (cache.containsKey(n)) return cache.get(n);

        // simulate expensive computation
        Thread.sleep(500);
        int result = n * n;
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) throws Exception {
        ExpensiveCalculator calc = new ExpensiveCalculator();

        Method method = ExpensiveCalculator.class.getMethod("square", int.class);

        System.out.println("First call: " + method.invoke(calc, 5)); // Computes
        System.out.println("Second call: " + method.invoke(calc, 5)); // Cached
        System.out.println("Third call: " + method.invoke(calc, 7)); // Computes
    }
}
