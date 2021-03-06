package com.ecomm.dao;

import com.ecomm.entities.CustmerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustmerRep extends JpaRepository<CustmerInfo, Long> {

}
