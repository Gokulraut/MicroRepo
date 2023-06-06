package com.csi.dao;

import com.csi.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ProductService", url = "http://localhost:9192")
public interface FeignClientProductService {
    @GetMapping(value = "/products/{prodId}")
    Product getProductById(@PathVariable int prodId);

}
