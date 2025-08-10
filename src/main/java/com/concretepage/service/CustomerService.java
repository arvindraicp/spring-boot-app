package com.concretepage.service;

import com.concretepage.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Customer> searchCustomer(String keyword) {
        // Create OR criteria
        Criteria criteria = new Criteria().orOperator(
                Criteria.where("cid").regex(keyword, "i"),
                Criteria.where("name").regex(keyword, "i"),
                Criteria.where("age").regex(keyword, "i")
        );

        Query query = new Query(criteria);

        return mongoTemplate.find(query, Customer.class);
    }
}
