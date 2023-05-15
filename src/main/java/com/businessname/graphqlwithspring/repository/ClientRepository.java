package com.businessname.graphqlwithspring.repository;

import com.businessname.graphqlwithspring.entity.Client;
import com.businessname.graphqlwithspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByProductsId(Long productId);

    List<Client> findByProducts(Product product);

    List<Client> findByProductsName(String productName);



}