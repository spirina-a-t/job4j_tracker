package ru.job4j.profession;

public class Doctor extends Profession {
    private int patient;
    private String diagnosis;
    private String prescription;

    public Doctor(String name, String surname, String education, String birthday,
                  int patient, String diagnosis, String prescription) {
        super(name, surname, education, birthday);
        this.patient = patient;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public int getPatient() {
        return patient;
    }

    public Diagnosis health(Patient patient) {
        return new Diagnosis(patient, this.diagnosis);
    }

    public Prescription heal(Patient patient) {
        return new Prescription(patient, this.prescription);
    }
}
