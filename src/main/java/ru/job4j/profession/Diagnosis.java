package ru.job4j.profession;

public class Diagnosis {
    private Patient patient;
    private String diagnosis;

    public Diagnosis(Patient patient, String diagnosis) {
        this.diagnosis = diagnosis;
        this.patient = patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
