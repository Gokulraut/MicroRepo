package com.csi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    private int prodId;

    private String prodName;

    private double prodPrice;

}
