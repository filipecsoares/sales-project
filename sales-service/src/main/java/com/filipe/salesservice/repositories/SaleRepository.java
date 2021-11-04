/*
* @(#)SaleRepository.java
*
* Copyright (c) J-Tech Solucoes em Informatica.
* All Rights Reserved.
*
* This software is the confidential and proprietary information of J-Tech.
* ("Confidential Information"). You shall not disclose such Confidential
* Information and shall use it only in accordance with the terms of the
* license agreement you entered into with J-Tech.
*/
package com.filipe.salesservice.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.filipe.salesservice.dto.SaleSuccessDTO;
import com.filipe.salesservice.dto.SaleSumDTO;
import com.filipe.salesservice.entities.Sale;

/**
 * Class SaleRepository.java
 *
 * @author filipe.soares
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.filipe.salesservice.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupBySeller();

    @Query("SELECT new com.filipe.salesservice.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();
}
