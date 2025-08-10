package com.concretepage.controller;

import com.concretepage.entity.Customer;
import com.concretepage.repository.CustomerRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("app")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("namebyid")
    public Customer getCName(@RequestParam("cid") String cid) {
        System.out.println("cid:" + cid);
        Customer ob =  customerRepository.findNameById(cid);
       // System.out.println("C:" + ob.getName());
        return ob;
    }
}