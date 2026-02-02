package com.lambdaExpression.methodreferences.hospitalpatient;

import java.util.List;

public class PatientIdPrinter {

    public static void main(String[] args) {

        List<Integer> patientIds = List.of(
                101, 102, 103, 104, 105
        );

        patientIds.forEach(System.out::println);
    }
}
