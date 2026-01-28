package com.Reflection.dependencyinjection;
public class Client {
    @Inject
    public Service service;

    public void doWork() {
        service.serve();
    }
}
