/*
* @(#)SellerService.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package com.filipe.salesservice.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.filipe.salesservice.dto.SellerDTO;
import com.filipe.salesservice.entities.Seller;
import com.filipe.salesservice.repositories.SellerRepository;

/**
 * Class SellerService.java
 *
 * @author filipe.soares
 */
@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        return sellers.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
