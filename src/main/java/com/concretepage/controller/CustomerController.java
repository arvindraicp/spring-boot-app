package com.concretepage.controller;

import com.concretepage.entity.Customer;
import com.concretepage.repository.CustomerRepository;
import com.concretepage.service.CustomerService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @GetMapping("namebyid")
    public Customer getCName(@RequestParam("cid") String cid) {
        System.out.println("cid:" + cid);
        Customer ob =  customerRepository.findNameById(cid);
       // System.out.println("C:" + ob.getName());
        return ob;
    }
    @GetMapping("search")
    public List<Customer> search(@RequestParam("q") String q) {
        System.out.println("query::" + q);
        return customerService.searchCustomer(q);
    }
}