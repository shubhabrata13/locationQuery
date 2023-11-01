package com.apmm.service;

import com.apmm.domain.Location;
import com.apmm.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class QueryService {
    @Autowired
    private LocationRepository repository;

    public Flux<Location> search(String name){
        return this.repository.findByName(name);
    }
}
