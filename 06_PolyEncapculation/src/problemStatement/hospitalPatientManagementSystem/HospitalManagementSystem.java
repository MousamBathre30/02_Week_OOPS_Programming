package problemStatement.hospitalPatientManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class HospitalManagementSystem {
    // Method to display patient billing details
    public static void displayBillingDetails(List<Patient> patients) {
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                System.out.println("Viewing Medical Records:");
                ((MedicalRecord) patient).viewRecords();
            }

            System.out.println("-----------");
        }
    }

    public static void main(String[] args) {
        // Create patients
        Patient inPatient = new InPatient("P123", "Alice", 30, 2000, 5); // 2000 per day for 5 days
        Patient outPatient = new OutPatient("P456", "Bob", 25, 500); // 500 consultation fee

        // Add medical records
        ((MedicalRecord) inPatient).addRecord("Admitted for surgery");
        ((MedicalRecord) inPatient).addRecord("Post-operative care");
        ((MedicalRecord) outPatient).addRecord("Consultation for flu");

        // Create a list of patients
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        // Display billing details
        displayBillingDetails(patients);
    }
}
