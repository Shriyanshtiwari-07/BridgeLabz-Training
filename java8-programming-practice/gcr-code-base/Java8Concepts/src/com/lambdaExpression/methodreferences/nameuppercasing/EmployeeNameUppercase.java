package com.lambdaExpression.methodreferences.nameuppercasing;

import java.util.List;

public class EmployeeNameUppercase {

    public static void main(String[] args) {

        List<String> employeeNames = List.of(
                "Nageshwar",
                "Lucky",
                "Ravi",
                "Himesh"
        );

        employeeNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
