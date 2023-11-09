package com.apmm.service;

import com.apmm.domain.Location;
import com.apmm.domain.LocationDetails;
import com.apmm.repository.LocationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.util.AssertionErrors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(SpringExtension.class)
public class QueryServiceTest {

    @InjectMocks
    private QueryService queryService;

    @Mock
    private LocationRepository locationRepository;

    private static final String location_str = "{\n" +
            "  \"bdas\": [\n" +
            "    {\n" +
            "      \"name\": \"SIKOP\",\n" +
            "      \"type\": \"Business Defined Area\",\n" +
            "      \"bdaType\": \"POOL\",\n" +
            "      \"alternateCodes\": [\n" +
            "        {\n" +
            "          \"code\": \"SVOWWQGRTLKKA\",\n" +
            "          \"codeType\": \"locationId\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"name\": \"GODOVIC\",\n" +
            "  \"status\": \"InActive\",\n" +
            "  \"bdaType\": null,\n" +
            "  \"country\": {\n" +
            "    \"name\": \"Slovenia\",\n" +
            "    \"alternateCodes\": [\n" +
            "      {\n" +
            "        \"code\": \"3P1JF15ZCBG5A\",\n" +
            "        \"codeType\": \"locationId\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"code\": \"SI\",\n" +
            "        \"codeType\": \"localcode1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"code\": \"140\",\n" +
            "        \"codeType\": \"localcode2\"\n" +
            "      }\n" +
            "    ]\n" +
            "  },\n" +
            "  \"geoType\": \"City\",\n" +
            "  \"parents\": [\n" +
            "    {\n" +
            "      \"name\": \"Slovenia\",\n" +
            "      \"type\": \"Country\",\n" +
            "      \"bdaType\": null,\n" +
            "      \"alternateCodes\": [\n" +
            "        {\n" +
            "          \"code\": \"3P1JF15ZCBG5A\",\n" +
            "          \"codeType\": \"locationId\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"code\": \"SI\",\n" +
            "          \"codeType\": \"localcode1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"code\": \"140\",\n" +
            "          \"codeType\": \"localcode2\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ],\n" +
            "  \"validTo\": \"2019-08-05\",\n" +
            "  \"hsudName\": null,\n" +
            "  \"latitude\": \"45.5724\",\n" +
            "  \"portFlag\": false,\n" +
            "  \"timeZone\": null,\n" +
            "  \"longitude\": \"10.0532\",\n" +
            "  \"validFrom\": \"1900-01-01\",\n" +
            "  \"locationId\": \"005JOMN2OKB5N\",\n" +
            "  \"restricted\": null,\n" +
            "  \"description\": null,\n" +
            "  \"dialingCode\": null,\n" +
            "  \"bdaLocations\": null,\n" +
            "  \"isMaerskCity\": true,\n" +
            "  \"olsonTimezone\": null,\n" +
            "  \"alternateCodes\": [\n" +
            "    {\n" +
            "      \"code\": \"G./\",\n" +
            "      \"codeType\": \"localcode2\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"code\": \"SIGOD\",\n" +
            "      \"codeType\": \"localcode1\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"code\": \"005JOMN2OKB5N\",\n" +
            "      \"codeType\": \"locationId\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"alternateNames\": null,\n" +
            "  \"subCityParents\": null,\n" +
            "  \"utcOffsetMinutes\": null,\n" +
            "  \"workaroundReason\": null,\n" +
            "  \"daylightSavingEnd\": null,\n" +
            "  \"daylightSavingTime\": null,\n" +
            "  \"daylightSavingStart\": null,\n" +
            "  \"postalCodeMandatory\": null,\n" +
            "  \"dialingCodeDescription\": null,\n" +
            "  \"stateProvinceMandatory\": null,\n" +
            "  \"daylightSavingShiftMinutes\": null\n" +
            "}";

    @Test
    public void shouldReturnsearchbyName() {
        Location location = new Location();
        location.setData(location_str);
        Mockito.when(locationRepository.findByName("test")).thenReturn(Flux.just(location));
        Flux<LocationDetails> locationFlux = queryService.search("test");
        StepVerifier
                .create(locationFlux)
                .consumeNextWith(data -> {
                    AssertionErrors.assertEquals("Name Matches",data.getName(), "GODOVIC");
                })
                .verifyComplete();
    }

    @Test
    public void shouldReturnsearchbylocationcode() {
        LocationDetails ld = new LocationDetails();
        ld.setName("test");
        ld.setBdaType("test");
        Location location = new Location();
        location.setData(location_str);
        Mockito.when(locationRepository.findByLocationCode("test")).thenReturn(Flux.just(location));
        Flux<LocationDetails> locationFlux = queryService.searchbylocationcode("test");
        StepVerifier
                .create(locationFlux)
                .consumeNextWith(data -> {
                    AssertionErrors.assertEquals("Name Matches",data.getName(), "GODOVIC");
                })
                .verifyComplete();
    }

    @Test
    public void shouldReturnsearchbylocationType() {
        LocationDetails ld = new LocationDetails();
        ld.setName("test");
        ld.setBdaType("test");
        Location location = new Location();
        location.setData(location_str);
        Mockito.when(locationRepository.findByLocationType("test")).thenReturn(Flux.just(location));
        Flux<LocationDetails> locationFlux = queryService.searchbylocationType("test");
        StepVerifier
                .create(locationFlux)
                .consumeNextWith(data -> {
                    AssertionErrors.assertEquals("Name Matches",data.getName(), "GODOVIC");
                })
                .verifyComplete();
    }

    @Test
    public void shouldReturnsearchbyGeoType() {
        LocationDetails ld = new LocationDetails();
        ld.setName("test");
        ld.setBdaType("test");
        Location location = new Location();
        location.setData(location_str);
        Mockito.when(locationRepository.findByGeoType("test")).thenReturn(Flux.just(location));
        Flux<LocationDetails> locationFlux = queryService.searchbyGeoType("test");
        StepVerifier
                .create(locationFlux)
                .consumeNextWith(data -> {
                    AssertionErrors.assertEquals("Name Matches",data.getName(), "GODOVIC");
                })
                .verifyComplete();
    }

}
