package com.literature.puranas.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;


import javax.servlet.http.HttpServletResponse;

@Getter
@AllArgsConstructor
public enum ReturnCode implements IReturnCode{
    SUCCESS(HttpServletResponse.SC_OK, "操作成功"),;
    final int code;
    final String message;
}
