package com.businessname.graphqlwithspring.service;

import com.businessname.graphqlwithspring.entity.Client;
import com.businessname.graphqlwithspring.entity.Product;
import com.businessname.graphqlwithspring.repository.ClientRepository;
import com.businessname.graphqlwithspring.repository.ProductRepository;
import com.businessname.graphqlwithspring.request.CreateClientRequest;
import com.businessname.graphqlwithspring.request.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(CreateClientRequest createClientRequest) {
        Client client = new Client(createClientRequest);
        client.setName(createClientRequest.getName());
        client.setEmail(createClientRequest.getEmail());

        List<Product> productList = new ArrayList<>();


        if(createClientRequest.getProducts() != null) {
            for (CreateProductRequest createProductRequest : createClientRequest.getProducts()) {
                Product product = new Product();
                product.setName(createProductRequest.getName());
                product.setDescription(createProductRequest.getDescription());
                product.setPrice(createProductRequest.getPrice());

                productList.add(product);
            }
            productRepository.saveAll(productList);
        }
        client.setProducts(productList);
        return client;
    }

    public Client getClientById(Long id) {
        // Retrieve a client by its ID from the repository
        return clientRepository.findById(id).orElse(null);
    }

}
