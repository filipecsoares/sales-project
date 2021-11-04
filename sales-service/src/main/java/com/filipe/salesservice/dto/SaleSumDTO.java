/*
* @(#)SaleSumDTO.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package com.filipe.salesservice.dto;

import java.io.Serializable;
import com.filipe.salesservice.entities.Seller;

/**
 * Class SaleSumDTO.java
 *
 * @author filipe.soares
 */
public class SaleSumDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO() {

    }

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
