package com.apmm.controller;

import com.apmm.domain.LocationDetails;
import com.apmm.exception.BadPayloadException;
import com.apmm.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/query")
public class QueryController {
    @Autowired
    private QueryService service;

    @GetMapping("/searchByName/{name}")
    public Flux<LocationDetails> search(@PathVariable("name") String name){
        if(name==null){
            throw new BadPayloadException("Name should be only alphabatic");
        }
        return this.service.search(name);
    }

    @GetMapping("/searchByCode/{code}")
    public Flux<LocationDetails> searchbylocationcodeAndType(@PathVariable("code") String code){
        return this.service.searchbylocationcode(code);
    }

    @GetMapping("/searchByCodeType/{type}")
    public Flux<LocationDetails> searchbyCodeType(@PathVariable("type") String type){
        return this.service.searchbylocationType(type);
    }

    @GetMapping("/searchByLocationType/{type}")
    public Flux<LocationDetails> searchbylocationType(@PathVariable("type") String type){
        return this.service.searchbyGeoType(type);
    }


}
