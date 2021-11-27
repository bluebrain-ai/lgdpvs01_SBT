package com.bluescript.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Data
@Component
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ksdsPolyKey implements Serializable {

    @Column(name = "REQUESTID")
    private String wfRequestId;
    @Column(name = "CUSTOMERNUM")
    private String wfCustomerNum;
    @Column(name = "POLICYNUM")
    private String wfPolicyNum;

    public String toFixedWidthString() {
        return wfRequestId + wfCustomerNum + wfPolicyNum;
    }

}