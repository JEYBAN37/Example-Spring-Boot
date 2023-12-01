package co.com.ucc.users.dominio.entity;

import co.com.ucc.users.repositorio.PersonRepository;
import co.com.ucc.users.repositorio.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    public PersonRepository personRepository;

    public List<PersonModel> getPersons(){
        return personRepository.getPersons();
    }

//public Person getUsersByName(String name){
      //  List<Person> allPersons = personRepository.getPersons();
       // Optional<Person> foundPersons = allPersons.stream().filter(person -> Objects.equals(person.name,name)).findFirst();
       // return foundPersons.get();
//}

public PersonModel createPerson(PersonModel person){
        return personRepository.createPerson(person);
    }
    public PersonModel updatePerson (PersonModel person){
        return personRepository.updatePerson(person);
    }

    public void deletePerson( long id){
        personRepository.deletePerson(id);
    }
}

