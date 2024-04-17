package com.minierp.minierp;

import com.minierp.minierp.BO.*;
import com.minierp.minierp.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class MinierpApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(MinierpApplication.class, args);
		System.out.println("Hello World!");

		Person person = context.getBean(Person.class);

		person.setTitle("Mr");
		person.setFirstname("Gowri Shankar");
		person.setLastname("Badugu");
		person.setGender("MALE");

		String dobString = "19980623";
		LocalDate dateofbirth = LocalDate.parse(dobString, DateTimeFormatter.BASIC_ISO_DATE);
		person.setDateofbirth(dateofbirth);

		String datecreatedstring = "20240416";
		LocalDate datecreated = LocalDate.parse(datecreatedstring, DateTimeFormatter.BASIC_ISO_DATE);
		person.setDatecreated(datecreated);
		person.setCreatedby(-1);

		PersonBO personBO =context.getBean(PersonBO.class);
		personBO.addPerson(person);

	}


}
