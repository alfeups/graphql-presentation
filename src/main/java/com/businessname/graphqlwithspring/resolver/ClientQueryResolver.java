package com.businessname.graphqlwithspring.resolver;

import com.businessname.graphqlwithspring.entity.Client;
import com.businessname.graphqlwithspring.entity.Order;
import com.businessname.graphqlwithspring.repository.ClientRepository;
import com.businessname.graphqlwithspring.repository.OrderRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderRepository orderRepository;


    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public List<Client> getClientsByProduct(Long productId) {
        List<Order> orders = orderRepository.findByProductsId(productId);
        List<Client> clients = new ArrayList<>();

        for (Order order : orders) {
            clients.add(order.getClient());
        }

        return clients;
    }

    public List<Client> getClientsByProductName(String productName) {
        return clientRepository.findByProductsName(productName);
    }


}
