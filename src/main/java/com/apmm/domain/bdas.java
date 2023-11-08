package com.apmm.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

//@Entity(name = "bdas")
//@Table
@JsonIgnoreProperties(ignoreUnknown = true)
public class bdas {

    public String name;
    public String type;
    public String bdaType;
    //public List<alternateCodes> alternateCodes;
    public bdas() {
        super();
    }
    public bdas(String name, String type, String bdaType, List<alternateCodes> alternateCodes) {
        this.name = name;
        this.type = type;
        this.bdaType = bdaType;
        //this.alternateCodes = alternateCodes;
    }
}
