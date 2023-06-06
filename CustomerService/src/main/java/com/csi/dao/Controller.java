package com.csi.dao;

import com.csi.model.Customer;
import com.csi.service.CustomerService;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class Controller {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public ResponseEntity<Customer>saveData(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.saveData(customer),HttpStatus.CREATED);

    }
    @GetMapping("/{custId}")
    public ResponseEntity<RestTemplateVo>getDataById(@PathVariable int custId){
        return  ResponseEntity.ok(customerService.getDataById(custId));
    }
}
