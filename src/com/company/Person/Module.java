package com.company.Person;

public enum Module {
    PB(Language.PYTHON), WEB(Language.WEB), OOP(Language.JAVASE), ADVANCE(Language.JAVAEE);
    private Language language;

    Module(Language language) {
        this.language = language;
    }
    public Language getLanguage(){
        return this.language;
    }

    @Override
    public String toString() {
        return "Module{" +
                "language=" + language +
                '}';
    }
}
