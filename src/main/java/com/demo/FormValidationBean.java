package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class FormValidationBean {
    private String username;
    private String email;
    private int age;

    private boolean formValide = false;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String formValidated(){
        formValide = true;
        System.out.println("Ici traitement après acceptation du formulaire.");
        return "formValidated";
    }

    public boolean isFormValide() {
        return formValide;
    }

    public void setFormValide(boolean formValide) {
        this.formValide = formValide;
    }
}
