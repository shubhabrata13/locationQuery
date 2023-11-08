package com.apmm.domain;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

//@Entity(name = "alternate_names")
//@Table
public class alternateNames {
    public String name;
    public String status;
    public String description;

    public alternateNames() {
        super();
    }

    public alternateNames(String name, String status, String description) {
        this.name = name;
        this.status = status;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
