package com.csi.dao;

import com.csi.model.OrderDetail;
import com.csi.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderDetailDaoImpl {
    @Autowired
    OrderRepo orderRepo;
    public OrderDetail saveData(OrderDetail orderDetail){
        return orderRepo.save(orderDetail);
    }
    public Optional<OrderDetail> getDataById(int orderId){
        return orderRepo.findById(orderId);
    }
}
