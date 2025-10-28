import java.util.*;

// Class to represent a Patient
class Patient {
    int patientId;
    String name;

    Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
}

public class PatientIDPrinter {
    public static void main(String[] args) {

        // List of patients
        List<Patient> patients = Arrays.asList(
            new Patient(101, "Krishna"),
            new Patient(102, "Ravi"),
            new Patient(103, "Priya"),
            new Patient(104, "Amit")
        );

        System.out.println("=== All Patients ===");
        patients.forEach(System.out::println); // Method reference to println

        System.out.println("\n=== Patient IDs Only ===");

        // Using Stream + Method Reference
        patients.stream()
                .map(Patient::getPatientId)   // Method reference to getPatientId
                .forEach(System.out::println); // Method reference to println
    }
}
