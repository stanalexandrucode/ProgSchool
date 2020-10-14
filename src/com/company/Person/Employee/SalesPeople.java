package com.company.Person.Employee;

import com.company.Person.Module;
import com.company.Person.Person;
import com.company.Person.Student;
import com.company.ProgrammingSchool;

import java.util.ArrayList;
import java.util.List;

public class SalesPeople extends Employee {
    List<Student> studentList;
    ProgrammingSchool programmingSchool;

    public SalesPeople(String name, String birthDate, String phoneNr, int salary) {
        super(name, birthDate, phoneNr, salary);
        this.studentList = new ArrayList<>();
    }

    public void hire(Student student) {
        if (student.getProgression() == 100 && student.getModule() == Module.ADVANCE) {
            System.out.println("angajat");
            studentList.add(student);
        }
    }

    @Override
    public void tick() {
        for (Person person : programmingSchool.getPersonList()) {
            hire((Student) person);
        }
//        System.out.println(studentList.stream().count());
    }
}
