package com.businessname.graphqlwithspring.response;

import com.businessname.graphqlwithspring.entity.Product;
import com.businessname.graphqlwithspring.request.CreateProductRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateProductResponse {
    private Long id;
    private String name;
    private String description;
    private double price;

    public CreateProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }

}
