package com.streamapi.insuranceclaimanalysis;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim("Health", 45000),
                new Claim("Vehicle", 30000),
                new Claim("Health", 55000),
                new Claim("Life", 120000),
                new Claim("Vehicle", 40000),
                new Claim("Life", 100000)
        );

        Map<String, Double> avgClaimByType =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              Claim::getClaimType,
                              Collectors.averagingDouble(Claim::getClaimAmount)
                      ));

        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " -> " + avg));
    }
}
