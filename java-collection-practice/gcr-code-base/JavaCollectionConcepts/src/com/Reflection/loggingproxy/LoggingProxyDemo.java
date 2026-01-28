package com.Reflection.loggingproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxyDemo {

    public static void main(String[] args) {
        Greeting greeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new InvocationHandler() {
                    Greeting impl = new GreetingImpl();

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("Executing method: " + method.getName());
                        return method.invoke(impl, args);
                    }
                }
        );

        greeting.sayHello("Alice");
    }
}
