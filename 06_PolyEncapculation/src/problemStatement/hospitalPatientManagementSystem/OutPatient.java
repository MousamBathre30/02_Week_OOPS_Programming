package problemStatement.hospitalPatientManagementSystem;

// OutPatient Class
import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalRecords;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Record added for OutPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for OutPatient:");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }

    @Override
    public String getPatientDetails() {
        return super.getPatientDetails() + ", Type: OutPatient, Consultation Fee: " + consultationFee;
    }
}
