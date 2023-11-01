package com.apmm.controller;

import com.apmm.domain.Location;
import com.apmm.repository.LocationRepository;
import com.apmm.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/query")
public class QueryController {
    @Autowired
    private QueryService service;

    @GetMapping("/searchByName")
    public Flux<Location> search(String name){
        return this.service.search(name);
    }
}
