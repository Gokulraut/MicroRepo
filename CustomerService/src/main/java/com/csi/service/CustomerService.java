package com.csi.service;

import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;
import com.csi.vo.OrderDetail;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerDaoImpl customerDao;

    public Customer saveData(Customer customer){
        return customerDao.saveData(customer);
    }
    public RestTemplateVo getDataById(int custId){

        return customerDao.getDataById(custId);

    }
}
