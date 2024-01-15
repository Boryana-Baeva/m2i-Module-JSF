package com.demo.checkbox;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CheckBoxBean {
    private List<String> options; // les differentes cases à cocher

    private List<String> optionsSelected; // les cases cochées par l'utilisateur

    public CheckBoxBean() {
        options = new ArrayList<>();
        options.add("lundi");
        options.add("mardi");
        options.add("mercredi");
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getOptionsSelected() {
        return optionsSelected;
    }

    public void setOptionsSelected(List<String> optionsSelected) {
        this.optionsSelected = optionsSelected;
    }

    public void submit() {
        System.out.println(optionsSelected.toString());
    }
}
