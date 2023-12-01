package co.com.ucc.users.repositorio.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long serial;
    private double value;

    private String name;

    public long getSerial () {return serial;}
    public void setSerial (long serial){
        this.serial = serial;
    }

    public double getValue (){return value;}
    public  void setValue (double value){this.value=value;}

    public String getName(){return name;}

    public void setName (String name){this.name = name;}



}
