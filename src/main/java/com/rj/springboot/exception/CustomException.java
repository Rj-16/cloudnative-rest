package com.rj.springboot.exception;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CustomException {
    private Date date;
    private String message;
    private String details;

}
