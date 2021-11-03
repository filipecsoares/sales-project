/*
* @(#)SellerRepository.java
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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.filipe.salesservice.entities.Seller;

/**
 * Class SellerRepository.java
 *
 * @author filipe.soares
 */
@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
