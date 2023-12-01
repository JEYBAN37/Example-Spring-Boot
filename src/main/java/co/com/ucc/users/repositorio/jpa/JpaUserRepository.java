package co.com.ucc.users.repositorio.jpa;

import co.com.ucc.users.repositorio.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository <UserModel, Long> {
    UserModel findById(long id);

}
