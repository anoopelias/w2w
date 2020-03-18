package com.w2w.What2Watch.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductionCompanyNotFoundException extends Exception{
    public ProductionCompanyNotFoundException(String message) {
        super(message);
    }
}
