package com.harsh.graphql.resolvers;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class resolver implements GraphQLQueryResolver {
   public String getFetchmessage(){
        return "Hello";
    }
    public String getByemessage(){
        return "Bye";
    }
    public String getFetchmessage(String name){
        return "Hello"+name;
    }
}
