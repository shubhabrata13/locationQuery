package com.apmm.repository;

import com.apmm.domain.Location;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface LocationRepository extends R2dbcRepository<Location, Integer> {

    @Query(value = "SELECT * FROM public.location WHERE data->>'name' LIKE '%'||$1||'%'")
    Flux<Location> findByName(String name);

    @Query(value = "SELECT * FROM public.location t,jsonb_array_elements(data->'alternateCodes') alternateCodes " +
            "WHERE alternateCodes->>'code' = $1")
    Flux<Location> findByLocationCode(String code);

    @Query(value = "SELECT * FROM public.location t,jsonb_array_elements(data->'alternateCodes') alternateCodes " +
            "WHERE alternateCodes->>'codeType' = $1")
    Flux<Location> findByLocationType(String type);

    @Query(value = "SELECT * FROM public.location WHERE data->>'geoType' = $1")
    Flux<Location> findByGeoType(String geotype);


}
