package org.tech.world.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CountryCodeNotFoundException extends RuntimeException {
    public CountryCodeNotFoundException() {
        super("INVALID_COUNTRY_CODE");
    }
}
