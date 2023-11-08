package com.apmm.domain;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

//@Entity(name = "bda_locations")
//@Table
public class bdaLocations {
    public String name;
    public String type;
    public String status;
    public List<alternateCodes> alternateCodes;
    public bdaLocations() {
        super();
    }
    public bdaLocations(String name, String type, String status, List<com.apmm.domain.alternateCodes> alternateCodes) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.alternateCodes = alternateCodes;
    }

}
