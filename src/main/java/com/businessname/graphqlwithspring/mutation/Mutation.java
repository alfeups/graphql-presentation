package com.businessname.graphqlwithspring.mutation;

import com.businessname.graphqlwithspring.repository.ClientRepository;
import com.businessname.graphqlwithspring.repository.ProductRepository;
import com.businessname.graphqlwithspring.request.CreateClientRequest;
import com.businessname.graphqlwithspring.response.ClientResponse;
import com.businessname.graphqlwithspring.service.ClientService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ProductRepository productRepository;

    public ClientResponse createClient(CreateClientRequest createClientRequest) {
        return new ClientResponse(clientService.createClient(createClientRequest));
    }



}
