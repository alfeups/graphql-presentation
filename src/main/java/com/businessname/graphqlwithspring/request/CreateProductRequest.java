package com.businessname.graphqlwithspring.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductRequest {

    private String name;
    private String description;
    private double price;

}
