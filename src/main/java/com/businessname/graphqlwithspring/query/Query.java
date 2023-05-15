package com.businessname.graphqlwithspring.query;

import com.businessname.graphqlwithspring.request.FullNameRequest;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;


@Component
public class Query implements GraphQLQueryResolver {

    public String helloWorld(){
        return "Hello World!";
    }

    public String fullName(FullNameRequest fullNameRequest){
        return fullNameRequest.getFirstName() + " " + fullNameRequest.getSurName();
    }

}
