package com.apmm.domain;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import io.r2dbc.postgresql.codec.Json;
import jakarta.persistence.Column;
import org.hibernate.annotations.Type;
import org.springframework.data.relational.core.mapping.Table;

@Table("location")
public class Location {

    @Column(name = "data")
    @Type(JsonType.class)
    private String data;

    public Location() {
        super();
    }
    public Location(String data) {
        super();
        this.data = data;

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
