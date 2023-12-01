package co.com.ucc.users.rest;

import co.com.ucc.users.dominio.entity.ProductService;
import co.com.ucc.users.repositorio.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<ProductModel> getProduts(){return productService.getProducts();}

    @GetMapping("/products/{serial}")
    public ProductModel getById(@RequestBody ProductModel product){return  null;}

    @PostMapping("/products")
    public  ProductModel createProduct(@RequestBody  ProductModel product){return  productService.createProduct(product);}

    @PutMapping("/products/{serial}")
    public  ProductModel updateProduct (@RequestBody ProductModel product){return  productService.updateProduct(product);}

    @DeleteMapping("/products/{serial}")
    public void deleteProduct (@PathVariable long serial){productService.deleteProduct(serial); }
}
