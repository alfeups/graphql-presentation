package com.businessname.graphqlwithspring.entity;

import com.businessname.graphqlwithspring.request.CreateClientRequest;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Product> products;

    public Client (CreateClientRequest createClientRequest){
        this.name = createClientRequest.getName();
        this.email = createClientRequest.getEmail();
    }

    public Client(Long id, String name, String email, List<Product> products) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Client() {

    }
}