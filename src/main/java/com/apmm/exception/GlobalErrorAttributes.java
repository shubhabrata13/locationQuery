package com.apmm.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.Map;

@Component
public class GlobalErrorAttributes extends DefaultErrorAttributes{
    private Logger LOGGER = LoggerFactory.getLogger(getClass());
    private HttpStatus errorstatus = HttpStatus.BAD_REQUEST;
    private String erromessage = "Bad Request,please try after sometime";

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {
        Map<String, Object> map = super.getErrorAttributes(request, options);

        if (getError(request) instanceof BadPayloadException) {
            map.put("status", HttpStatus.UNAUTHORIZED.value());
            map.put("error", HttpStatus.UNAUTHORIZED.getReasonPhrase());
        } else {
            map.put("status", getErrorstatus());
            map.put("message", getErromessage());
        }
        return map;
    }

    public HttpStatus getErrorstatus() {
        return errorstatus;
    }

    public void setErrorstatus(HttpStatus errorstatus) {
        this.errorstatus = errorstatus;
    }

    public String getErromessage() {
        return erromessage;
    }

    public void setErromessage(String erromessage) {
        this.erromessage = erromessage;
    }
}
