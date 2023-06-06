package com.csi.controller;

import com.csi.model.OrderDetail;
import com.csi.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orderdetails")
public class Controller {

@Autowired
    OrderDetailService orderDetailService;

@PostMapping("/")
public ResponseEntity<OrderDetail>saveData(@RequestBody OrderDetail orderDetail){
    return ResponseEntity.ok(orderDetailService.saveData(orderDetail));

}
@GetMapping("/{orderId}")
public ResponseEntity<Optional<OrderDetail>> getDataById(@PathVariable int orderId){
    return ResponseEntity.ok(orderDetailService.getDataById(orderId));
}
}
