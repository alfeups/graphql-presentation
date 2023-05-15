package com.businessname.graphqlwithspring.repository;

import com.businessname.graphqlwithspring.entity.Client;
import com.businessname.graphqlwithspring.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT DISTINCT o.client FROM Order o JOIN o.products p WHERE p.id = :productId")
    List<Client> findClientsByProduct(@Param("productId") Long productId);

    @Query("SELECT o FROM Order o JOIN o.products p WHERE p.id = :productId")
    List<Order> findByProductsId(@Param("productId") Long productId);

}