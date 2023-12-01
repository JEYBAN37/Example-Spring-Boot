package co.com.ucc.users.repositorio;

import co.com.ucc.users.repositorio.jpa.JpaProductRepository;
import co.com.ucc.users.repositorio.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
 @Autowired
 private JpaProductRepository jpaProductRepository;

 public List<ProductModel> getProducts (){
     return  jpaProductRepository.findAll();
 }

 public ProductModel createProduct (ProductModel product){
     return jpaProductRepository.save(product);
 }

 public ProductModel updateProduct (ProductModel product){
     return jpaProductRepository.save(product);
 }

 public void deleteProduct (long serial){
     jpaProductRepository.deleteById(serial);
 }

}

