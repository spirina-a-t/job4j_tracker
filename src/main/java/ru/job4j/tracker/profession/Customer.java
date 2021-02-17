package ru.job4j.tracker.profession;

public class Customer {
    private String company;
    private Project project;

    public Customer(String company, Project project) {
        this.company = company;
        this.project = project;
    }

    public String getCompany() {
        return company;
    }

    public Project getProject() {
        return project;
    }
}
