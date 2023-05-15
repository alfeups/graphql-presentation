package com.businessname.graphqlwithspring.request;

import com.businessname.graphqlwithspring.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class CreateClientRequest {
    private String name;
    private String email;
    private List<CreateProductRequest> products;

}