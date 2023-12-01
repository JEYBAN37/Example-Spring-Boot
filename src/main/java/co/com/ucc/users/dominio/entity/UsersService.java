package co.com.ucc.users.dominio.entity;

import co.com.ucc.users.repositorio.UsersRepository;
import co.com.ucc.users.repositorio.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    public UsersRepository usersRepository;

    public List<UserModel> getUsers(){

        return usersRepository.getUsers();
    }

    public UserModel getUsersById(long id){
      return usersRepository.findById(id);
    }

    public UserModel createUser(UserModel user){
        return usersRepository.createUser(user);

    }

    public UserModel updateUser (UserModel user){
      return usersRepository.updateUser(user);
    }

    public void deleteUser (long id){
        usersRepository.deleteProduct(id);
    }


    }

