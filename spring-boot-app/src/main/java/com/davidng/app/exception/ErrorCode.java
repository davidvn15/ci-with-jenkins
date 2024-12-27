package com.davidng.app.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    ERROR_DUPLICATE("CF_275", "Duplicated data, please try again later");

    private final String code;
    private final String message;
}
