package com.csi.service;

import com.csi.dao.OrderDetailDaoImpl;
import com.csi.model.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderDetailService {
@Autowired
    OrderDetailDaoImpl orderDetailDao;

    public OrderDetail saveData(OrderDetail orderDetail){
        return orderDetailDao.saveData(orderDetail);
    }
    public Optional<OrderDetail> getDataById(int orderId){
        return orderDetailDao.getDataById(orderId);
    }
}
