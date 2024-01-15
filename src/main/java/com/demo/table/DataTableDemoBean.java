package com.demo.table;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;

@Named("personsBean")
@RequestScoped
public class DataTableDemoBean {

    private ArrayList<Person> persons = new ArrayList<>();

    public DataTableDemoBean() {
        persons.add(new Person("Michel", "Delpech", "m.dempech@gmail.com"));
        persons.add(new Person("Chantal", "Goya", "g.goya@gmail.com"));
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}
