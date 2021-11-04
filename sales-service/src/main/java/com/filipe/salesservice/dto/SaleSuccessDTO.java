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
public class SaleSuccessDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO() {

    }

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Long getVisited() {
        return visited;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    public Long getDeals() {
        return deals;
    }

    public void setDeals(Long deals) {
        this.deals = deals;
    }
}
