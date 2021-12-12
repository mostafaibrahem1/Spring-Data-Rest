package com.main.DataRest.Repositories;
import com.main.DataRest.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
