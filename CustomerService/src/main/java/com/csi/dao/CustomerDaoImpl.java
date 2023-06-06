package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRepo;
import com.csi.vo.OrderDetail;
import com.csi.vo.Product;
import com.csi.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImpl {


    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    FeignClientOrderDetailServeice feignClientOrderDetailServeice;

    @Autowired
    FeignClientProductService feignClientProductService;


    public Customer saveData(Customer customer) {
        return customerRepoImpl.save(customer);
    }

    public RestTemplateVo getDataById(int custId) {

        RestTemplateVo restTemplateVO = new RestTemplateVo();

        Customer customer = customerRepoImpl.findByCustId(custId);

       Product product = feignClientProductService.getProductById(customer.getProdId());

        OrderDetail orderDetail = feignClientOrderDetailServeice.getOrderDetailById(customer.getOrderId());

        restTemplateVO.setCustomer(customer);

       restTemplateVO.setProduct(product);

        restTemplateVO.setOrderDetail(orderDetail);

        return restTemplateVO;
    }
}
