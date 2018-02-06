package com.olegoprysk.main;

import com.olegoprysk.dao.PersonDAO;
import com.olegoprysk.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringHibernateMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PersonDAO personDAO = context.getBean(PersonDAO.class);
        Person person = new Person();

        person.setName("Oleg");
        person.setCountry("Ukraine");

        personDAO.save(person);

        System.out.println("Person::" + person);


        List<Person> list = personDAO.list();

        for (Person per : list)
            System.out.println(per);
        context.close();
    }
}
