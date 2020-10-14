package com.company.Person.Employee;

import com.company.Person.Language;
import com.company.Person.Module;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Employee {
    private Module module;
    private List<Language> languageList;

    public Mentor(String name, String birthDate, String phoneNr, int salary, Language language) {
        super(name, birthDate, phoneNr, salary);
        this.languageList = new ArrayList<>();
        languageList.add(language);
    }

    public boolean checkLanguage(Module module) {
        return languageList.contains(module.getLanguage());
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public Module getModule() {
        return module;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    @Override
    public void tick() {

    }

    @Override
    public String toString() {
        return "Mentor{" +
                "module=" + module +
                ", languageList=" + languageList +
                '}';
    }
}
