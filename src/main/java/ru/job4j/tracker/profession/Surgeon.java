package ru.job4j.tracker.profession;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday,
                   int patient, String diagnosis, String prescription) {
        super(name, surname, education, birthday, patient, diagnosis, prescription);
    }
}
