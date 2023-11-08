package com.apmm.domain;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

//@Entity(name = "alternate_codes")
//@Table
public class alternateCodes {
    public String code;
    public String codeType;

    public alternateCodes() {
        super();
    }
    public alternateCodes(String code,String codeType) {
        super();
        this.code = code;
        this.codeType = codeType;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }


}
