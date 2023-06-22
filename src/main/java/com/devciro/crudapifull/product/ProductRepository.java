package com.devciro.crudapifull.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    //esto es lo mismo que esta query
    //@Query("SELECT * FROM Product p WHERE p.name = algo")

    Optional<Product>findProductByName(String name);
}
