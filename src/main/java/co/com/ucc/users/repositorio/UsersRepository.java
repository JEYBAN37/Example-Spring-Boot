package co.com.ucc.users.repositorio;

import co.com.ucc.users.dominio.entity.User;
import co.com.ucc.users.repositorio.jpa.JpaUserRepository;
import co.com.ucc.users.repositorio.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UsersRepository {

    private static Map<Long,UserModel> userCache = new HashMap<>();
    @Autowired
    private JpaUserRepository jpaUserRepository;

    private static List<User> users =new ArrayList<>();
    public List<UserModel> getUsers(){

        return jpaUserRepository.findAll();
    }

    public UserModel createUser(UserModel user){

        return jpaUserRepository.save(user);
    }

    public UserModel updateUser(UserModel user){

        return jpaUserRepository.save(user);
    }

    public void deleteProduct (long id){
        jpaUserRepository.deleteById(id);
    }

    public UserModel findById(long id){
    UserModel userFound = userCache.get(id);
    if (Objects.isNull(userFound)){
        userFound = jpaUserRepository.findById(id);
        if (Objects.nonNull(userFound)){
            userCache.put(id,userFound);
        }
    }


        return  jpaUserRepository.findById(id);
    }

}
