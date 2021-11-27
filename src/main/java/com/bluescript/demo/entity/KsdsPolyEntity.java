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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "KSDSPOLY")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class KsdsPolyEntity implements Serializable {

    @EmbeddedId // composite Key
    private ksdsPolyKey policyKey;

    @Column(name = "BPostcode")
    private String wfBPostcode;
    @Column(name = "BStatus")
    private int wfBStatus;
    @Column(name = "BCustomer")
    private String wfBCustomer;
    @Column(name = "EWith_Profits")
    private String wfEWithProfits;
    @Column(name = "EEquities")
    private String wfEEquities;
    @Column(name = "EManagedFund")
    private String wfEManagedFund;
    @Column(name = "EFund_Name")
    private String wfEFundName;
    @Column(name = "ELife_Assured")
    private String wfELifeAssured;
    @Column(name = "HProperty_Type")
    private String wfHPropertyType;
    @Column(name = "HBedrooms")
    private int wfHBedrooms;
    @Column(name = "HValue")
    private int wfHValue;
    @Column(name = "HPostcode")
    private String wfHPostcode;
    @Column(name = "HHouse_Name")
    private String wfHHouseName;
    @Column(name = "MMake")
    private String wfMMake;
    @Column(name = "MModel")
    private String wfMModel;
    @Column(name = "fMValu")
    private int wfMValue;
    @Column(name = "fMRegnumber")
    private String wfMRegnumber;

}