package com.businessname.graphqlwithspring.response;

import com.businessname.graphqlwithspring.entity.Client;
import com.businessname.graphqlwithspring.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class ClientResponse {

    private Long id;
    private String name;
    private String email;
    private List<Product> products;


    public ClientResponse(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.email = client.getEmail();
        this.products = client.getProducts();
    }
}
