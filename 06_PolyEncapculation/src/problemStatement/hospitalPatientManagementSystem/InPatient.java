package problemStatement.hospitalPatientManagementSystem;

// InPatient Class
import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private List<String> medicalRecords;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Record added for InPatient: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for InPatient:");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }

    @Override
    public String getPatientDetails() {
        return super.getPatientDetails() + ", Type: InPatient, Days Admitted: " + daysAdmitted + ", Daily Rate: " + dailyRate;
    }
}
