package co.com.ucc.users.repositorio.jpa;

import co.com.ucc.users.repositorio.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductModel, Long> {
  ProductModel findByName(String username);
}
