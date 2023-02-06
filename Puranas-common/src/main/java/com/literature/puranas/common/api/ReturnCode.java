package com.literature.puranas.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;


import javax.servlet.http.HttpServletResponse;

@Getter
@AllArgsConstructor
public enum ReturnCode implements IReturnCode{
    SUCCESS(HttpServletResponse.SC_OK, "操作成功"),
    FAILURE(HttpServletResponse.SC_BAD_REQUEST, "业务异常"),;
    final int code;
    final String message;
}
