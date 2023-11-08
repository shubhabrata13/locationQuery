package com.apmm.service;

import com.apmm.domain.LocationDetails;
import com.apmm.exception.BadPayloadException;
import com.apmm.repository.LocationRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class QueryService {
    @Autowired
    private LocationRepository repository;

    public Flux<LocationDetails> search(String name){
        return this.repository.findByName(name)
                .map(consumerRecord->mapObject(consumerRecord.getData()))
                .doOnError(data->{throw new BadPayloadException("BadPayload in Name");});
    }

    public Flux<LocationDetails> searchbylocationcode(String code){
        return this.repository.findByLocationCode(code)
                .map(consumerRecord->mapObject(consumerRecord.getData()))
                .doOnError(data->{throw new BadPayloadException("BadPayload in locationcode");});
    }

    public Flux<LocationDetails> searchbylocationType(String type){
        return this.repository.findByLocationType(type)
                .map(consumerRecord->mapObject(consumerRecord.getData()))
                .doOnError(data->{throw new BadPayloadException("BadPayload in locationType");});
    }

    public Flux<LocationDetails> searchbyGeoType(String type){
        return this.repository.findByGeoType(type)
                .map(consumerRecord->mapObject(consumerRecord.getData()))
                .doOnError(data->{throw new BadPayloadException("BadPayload in GeoType");});
    }

    public LocationDetails mapObject(String message) {
        LocationDetails readValue1=null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            readValue1 = mapper.readValue(message, LocationDetails.class);
        }catch(Exception e){
            e.printStackTrace();
        }
        return readValue1;
    }
}
