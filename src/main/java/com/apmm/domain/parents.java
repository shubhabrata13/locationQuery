package com.apmm.domain;

import java.util.List;

public class parents {
    public String name;
    public String type;
    public String bdaType;
    public List<alternateCodes> alternateCodes;

    public parents() {
        super();
    }
    public parents(String name,String type,String bdaType,List<alternateCodes> alternateCodes) {
        super();
        this.name = name;
        this.type = type;
        this.bdaType = bdaType;
        this.alternateCodes = alternateCodes;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBdaType() {
        return bdaType;
    }

    public void setBdaType(String bdaType) {
        this.bdaType = bdaType;
    }

    public List<com.apmm.domain.alternateCodes> getAlternateCodes() {
        return alternateCodes;
    }

    public void setAlternateCodes(List<com.apmm.domain.alternateCodes> alternateCodes) {
        this.alternateCodes = alternateCodes;
    }

}
