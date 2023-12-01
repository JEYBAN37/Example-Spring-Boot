package co.com.ucc.users.repositorio;

import co.com.ucc.users.dominio.entity.Person;
import co.com.ucc.users.repositorio.jpa.JpaPersonRepository;
import co.com.ucc.users.repositorio.model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    @Autowired
    private JpaPersonRepository jpaPersonRepository;

    private static List<Person> persons = new ArrayList<>();

    public List<PersonModel> getPersons(){return jpaPersonRepository.findAll();}

    public PersonModel createPerson (PersonModel person){

        return jpaPersonRepository.save(person);
    }

    public PersonModel updatePerson (PersonModel person){


       // for(int index = 0; index < persons.size();index++){
          //  if (persons.get(index).name == person.name){
           //     persons.get(index).name= person.name;
             //   persons.get(index).lastname = person.lastname;
            //}
        //}

        return jpaPersonRepository.save(person);
    }

    public void deletePerson(long id){

        jpaPersonRepository.deleteById(id);

    }

}
