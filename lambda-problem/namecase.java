import java.util.*;
import java.util.stream.Collectors;

public class NameUppercaseDemo {
    public static void main(String[] args) {
        // Employee names
        List<String> employees = Arrays.asList("Krishna", "Ravi", "Priya", "Amit", "Sneha");

        System.out.println("=== Original Employee Names ===");
        employees.forEach(System.out::println);

        // Convert all names to uppercase using method reference
        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)  // Method reference
                                           .collect(Collectors.toList());

        System.out.println("\n=== Uppercased Employee Names ===");
        upperNames.forEach(System.out::println);
    }
}
