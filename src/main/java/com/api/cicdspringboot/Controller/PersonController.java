package com.api.cicdspringboot.Controller;
import com.api.cicdspringboot.service.PersonService;
import com.api.exception.UnsupportedMathOperationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {

        return null;
    }

}
