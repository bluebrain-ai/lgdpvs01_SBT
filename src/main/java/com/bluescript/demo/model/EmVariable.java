package com.bluescript.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import java.util.*;

import org.springframework.stereotype.Component;

@Data
@Component

public class EmVariable {
    private String emCusnum;
    private int emResprc;
    private int emResp2Rc;

    public String toFixedWidthString() {
        return emCusnum + emResprc + emResp2Rc;
    }

}