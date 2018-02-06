package com.olegoprysk.dao;

import com.olegoprysk.model.Person;

import java.util.List;

public interface PersonDAO {
    public void save(Person person);

    public List<Person> list();

}
