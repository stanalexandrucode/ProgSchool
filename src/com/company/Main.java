package com.company;

import com.company.Person.Employee.Mentor;
import com.company.Person.Employee.SalesPeople;
import com.company.Person.Language;
import com.company.Person.Student;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		var student1 = new Student("Stan", "1-1-1980", "024338141");
		var student2 = new Student("Alex", "2-2-1990", "011111111");
		var mentorPython = new Mentor("Gigi", "5-5-1800", "0800-8800", 2000, Language.PYTHON);
		var mentorJAVASE = new Mentor("Nelu", "5-5-1800", "0800-8800", 2000, Language.JAVASE);
		var mentorJAVAEE = new Mentor("Nicu", "10-5-1700", "0890-9900", 2000, Language.JAVAEE);
		var saleguy = new SalesPeople("Delia", "7-7-2000", "1234-1234", 1000);

		var school = new ProgrammingSchool();

		school.addAllPerson(student1,student2);
		school.addAllEmployee(mentorPython,mentorJAVASE,mentorJAVAEE);
//daca o adaug pe delia se strica programingggSCULU 
		while (true){
			Thread.sleep(1000);
			school.tickSchool();
		}

	}
}
