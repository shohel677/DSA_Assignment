package DSA.SortingAssignment;

class Patient {
    int patientId;
    String name;
    int age;
    int severityScore;

    public Patient(int patientId, String name, int age, int severityScore) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.severityScore = severityScore;
    }

    @Override
    public String toString() {
        return patientId + " " + name + " " + age + " " + severityScore;
    }
}
