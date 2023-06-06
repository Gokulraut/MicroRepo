package com.csi.repo;


import com.csi.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderDetail,Integer> {
}
