package ru.job4j.profession;

public class Prescription {
    private Patient patient;
    private String prescription;

    public Prescription(Patient patient, String prescription) {
        this.prescription = prescription;
        this.patient = patient;
    }

    public String getPrescription() {
        return prescription;
    }
}
