package co.com.ucc.users.rest;

import co.com.ucc.users.dominio.entity.UsersService;
import co.com.ucc.users.repositorio.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<UserModel> getUsers(){
        return usersService.getUsers();
    }

    @GetMapping("/users/{id}")
    public  UserModel getUser (@PathVariable long id ){return this.usersService.getUsersById(id);}

    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel user){
        return usersService.createUser(user);
    }

    @PutMapping("/users/{id}")
    public UserModel updateUser(@RequestBody UserModel user){
        return usersService.updateUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable long id){
         usersService.deleteUser(id);

   }



}