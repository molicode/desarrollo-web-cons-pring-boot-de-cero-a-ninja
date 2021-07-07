package com.udemy.service.impl;

import com.udemy.model.Person;
import com.udemy.service.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

    @Override
    public List<Person> getListPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alejandro",36));
        people.add(new Person("Alberto",30));
        people.add(new Person("Pedro",43));
        people.add(new Person("Maria",23));
        people.add(new Person("Juan",29));

        LOG.info("HELLO FROM SERVICE");

        return people;
    }
}
