package com.harsh.graphql.queryresolvers;

import java.util.ArrayList;
import java.util.List;

import com.harsh.graphql.pojo.employee;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
@Component
public class query implements GraphQLQueryResolver{
    public List<employee> getEmployees(){
        List<employee> list =new ArrayList<>();
        employee emp=new employee();
        emp.setID("1");
        emp.setName("harsh");
        emp.setDepartment("department");
        list.add(emp);
        return list;
    }
}
