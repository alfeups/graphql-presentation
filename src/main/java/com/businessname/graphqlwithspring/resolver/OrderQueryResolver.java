package com.businessname.graphqlwithspring.resolver;

import com.businessname.graphqlwithspring.entity.Client;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.businessname.graphqlwithspring.entity.Order;
import com.businessname.graphqlwithspring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

}
