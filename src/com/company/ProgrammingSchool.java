package com.company;

import com.company.Person.Employee.Employee;
import com.company.Person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgrammingSchool {
    private List<Person> personList;
    private List<Employee> employeeList;

    public ProgrammingSchool() {
        this.personList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }

    public void addAllPerson(Person... person) {
        Collections.addAll(personList, person);
    }

    public void addAllEmployee(Employee... employee) {
        Collections.addAll(employeeList, employee);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void tickSchool(){
        for (Person person : personList) {
            System.out.println("tickperson");
            person.tick();
        }
        for (Employee employee : employeeList) {
            employee.tick();
        }
    }
}
