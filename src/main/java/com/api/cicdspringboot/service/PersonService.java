package com.api.cicdspringboot.service;

import com.api.cicdspringboot.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service //@service junto com o @autowired cria instancias de objetos em runtime
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id){

        logger.info("Finding a person");
        return new Person();

    }
}
