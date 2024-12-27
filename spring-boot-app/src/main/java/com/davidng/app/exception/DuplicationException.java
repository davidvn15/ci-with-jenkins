package com.davidng.app.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class DuplicationException extends RuntimeException {
    private String code;
    private String message;
    private HttpStatus httpStatus;

    public DuplicationException(String code, String message) {
        this.code = code;
        this.message = message;
        httpStatus = HttpStatus.BAD_REQUEST;
    }
}
