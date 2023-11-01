package com.apmm.repository;

import com.apmm.domain.Location;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface LocationRepository extends R2dbcRepository<Location, Integer>{

    @Query(value = "SELECT * FROM public.location WHERE data->>'name' = $1")
    Flux<Location> findByName(String name);

    @Query(value = "SELECT * FROM public.location WHERE data->>'name' = $1")
    Flux<Location> findByLocationCode(String code);


}
