package DSA.SortingAssignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void sortPatients(int n, String[] records) {
        List<Patient> patients = new ArrayList<>();

        // Read patient details from the records array
        for (int i = 0; i < n; i++) {
            String[] patientDetails = records[i].split(" ");
            int patientId = Integer.parseInt(patientDetails[0]);
            String name = patientDetails[1];
            int age = Integer.parseInt(patientDetails[2]);
            int severityScore = Integer.parseInt(patientDetails[3]);

            patients.add(new Patient(patientId, name, age, severityScore));
        }

        patients.sort((p1, p2) -> {
            if (p2.severityScore != p1.severityScore) {
                return Integer.compare(p2.severityScore, p1.severityScore);
            } else {
                return Integer.compare(p1.age, p2.age);
            }
        });

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        String[] records = {
                "101 Alice 30 5",
                "102 Bob 25 8",
                "103 Charlie 40 8",
                "104 David 35 6",
                "105 Eve 28 5"
        };

        sortPatients(n, records);
    }
}
