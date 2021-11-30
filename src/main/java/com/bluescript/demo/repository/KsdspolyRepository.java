package com.bluescript.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bluescript.demo.entity.KsdsPolyEntity;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface KsdspolyRepository extends CrudRepository<KsdsPolyEntity, String> {

    // void deleteByWfRequestIdAndIdWfPolicyNumAndIdWfCustomerNum(String wfRequestId, String wfPolicyNum,
    // String wfCustomerNum);
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "DELETE FROM KSDSPOLY WHERE REQUESTID = ? AND CUSTOMERNUM =? AND POLICYNUM = ?", nativeQuery = true)
    void deleteByKsdsPolyKey(String wfRequestId, String wfCustomerNum, String wfPolicyNum);
}