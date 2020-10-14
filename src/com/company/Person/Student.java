package com.company.Person;

public class Student extends Person {
    private Module module;
    private int progression;

    public Student(String name, String birthDate, String phoneNr) {
        super(name, birthDate, phoneNr);
        this.module = Module.PB;
        this.progression = 0;
    }

    @Override
    public void tick() {
        if (this.module.equals(Module.PB) && progression == 0) {
            this.progression = 100;
        } else if (this.module.equals(Module.PB) && progression == 100) {
            this.progression = 0;
            this.module = Module.WEB;
        } else if (this.module.equals(Module.WEB) && progression == 0) {
            this.progression = 100;
        } else if (this.module.equals(Module.WEB) && progression == 100) {
            this.progression = 0;
            this.module = Module.OOP;
        } else if (this.module.equals(Module.OOP) && progression == 0) {
            this.progression = 100;
        } else if (this.module.equals(Module.OOP) && progression == 100) {
            this.progression = 0;
            this.module = Module.ADVANCE;
        } else if (this.module.equals(Module.ADVANCE) && progression == 0) {
            this.progression = 100;
        } else if (this.module.equals(Module.ADVANCE) && progression == 100) {
        }
        System.out.println(getName()+ getProgression()+getModule());
    }

    public Module getModule() {
        return module;
    }

    public int getProgression() {
        return progression;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public void setProgression(int progression) {
        this.progression = progression;
    }

    @Override
    public String toString() {
        return "Student{" +
                "module=" + module +
                ", progression=" + progression +
                '}';
    }
}
