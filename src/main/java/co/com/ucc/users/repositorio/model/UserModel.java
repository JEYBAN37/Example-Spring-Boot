package co.com.ucc.users.repositorio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    private String userme;
    private String age;

    private String telephone;

    private String city;

    public long getId(){
        return id;
    }
    public void setId(long id){this.id = id;}

    public String getName () {
        return name;
    }
    public void setName (String name){
        this.name=name;
    }

    public String getUserme () {
        return userme;
    }
    public void setUserme (String userme){
    this.userme=userme;    }

    public String getAge (){return age;}
    public void setAge(String age){this.age= age;}

    public String getTelephone(){return  telephone;}
    public void setTelephone(String telephone){this.telephone=telephone;}
    public String getCity (){return city;}
    public void setCity (String city){this.city=city;}


}
