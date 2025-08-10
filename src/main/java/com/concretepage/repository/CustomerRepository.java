package com.concretepage.repository;

import com.concretepage.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    @Query("{'cid':?0}")
    Customer findNameById(String cid);

//    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//    List<GroceryItem> findAll(String category);

    //public long count();
}
