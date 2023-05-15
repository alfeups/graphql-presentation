package com.businessname.graphqlwithspring.resolver;

import com.businessname.graphqlwithspring.entity.Product;
import com.businessname.graphqlwithspring.repository.ProductRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQueryResolver implements GraphQLQueryResolver {

    private final ProductRepository productRepository;

    public ProductQueryResolver(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
