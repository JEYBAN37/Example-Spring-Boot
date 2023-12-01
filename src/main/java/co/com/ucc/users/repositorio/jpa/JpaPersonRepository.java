package co.com.ucc.users.repositorio.jpa;

import co.com.ucc.users.repositorio.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPersonRepository extends JpaRepository <PersonModel,Long> {
    PersonModel findByName(String username);
}
