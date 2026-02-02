package com.streamapi.hospitaldoctoravailability;

import java.util.*;

public class DoctorAvailability {

    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Khan", "Orthopedics", true),
                new Doctor("Dr. Rao", "Dermatology", true),
                new Doctor("Dr. Singh", "Neurology", true)
        );

        doctors.stream()
               .filter(Doctor::isAvailableOnWeekend)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
