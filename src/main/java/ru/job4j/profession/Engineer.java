package ru.job4j.profession;

public class Engineer extends Profession {
    private int project;
    private String customer;

    public Engineer(String name, String surname, String education, String birthday,
                    int project, String customer) {
        super(name, surname, education, birthday);
        this.project = project;
        this.customer = customer;
    }

    public int getProject() {
        return project;
    }

    public Customer contractor(Project project) {
        return new Customer(this.customer, project);
    }
}
