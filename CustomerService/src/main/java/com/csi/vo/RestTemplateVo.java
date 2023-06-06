package com.csi.vo;

import com.csi.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestTemplateVo {


    private Customer customer;
    private OrderDetail orderDetail;
    private Product product;
}
