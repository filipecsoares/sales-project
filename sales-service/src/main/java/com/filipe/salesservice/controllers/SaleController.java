/*
* @(#)SaleController.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package com.filipe.salesservice.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.filipe.salesservice.dto.SaleDTO;
import com.filipe.salesservice.dto.SaleSuccessDTO;
import com.filipe.salesservice.dto.SaleSumDTO;
import com.filipe.salesservice.service.SaleService;

/**
 * Class SaleController.java
 *
 * @author filipe.soares
 */
@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
        return ResponseEntity.ok(service.amountGroupBySeller());
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
        return ResponseEntity.ok(service.successGroupBySeller());
    }
}
