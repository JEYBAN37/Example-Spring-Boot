package co.com.ucc.users.rest;

import co.com.ucc.users.dominio.entity.PersonService;
import co.com.ucc.users.repositorio.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonModel> getPersons(){return personService.getPersons();}

    @PostMapping("/persons")
    public PersonModel createPerson(@RequestBody PersonModel person){ return  personService.createPerson(person);}

    @PutMapping("/persons/{id}")
    public PersonModel updatePerson (@RequestBody PersonModel person){return  personService.updatePerson(person);}


    @DeleteMapping("/persons/{id}")
    public void deletePerson (@PathVariable long id){personService.deletePerson(id);}
}


