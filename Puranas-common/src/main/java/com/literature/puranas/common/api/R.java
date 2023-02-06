package com.literature.puranas.common.api;

import com.literature.puranas.common.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T data;

    public static <T> R<T> restReturn(int code, T data, String msg) {
        R<T> result = new R<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    public static <T> R<T> data() {
        return restReturn(ReturnCode.SUCCESS.getCode(), null, CommonConstants.DefaultReturnMsg);
    }

    public static <T> R<T> data(int code,T data,String msg) {
        return restReturn(code, data, msg);
    }

    public static <T> R<T> success() {
        return restReturn(ReturnCode.SUCCESS.getCode(), null, null);
    }
    public static <T> R<T> success(T data) {
        return restReturn(ReturnCode.SUCCESS.getCode(),data, null);
    }
    public static <T> R<T> success(T data, String msg) {
        return restReturn(ReturnCode.SUCCESS.getCode(),data,  msg);
    }
    public static <T> R<T> fail(String msg) {
        return restReturn(ReturnCode.FAILURE.getCode(),null,  msg);
    }

    public static <T> R<T> fail(T data) {
        return restReturn(ReturnCode.FAILURE.getCode(),data, null);
    }

    public static <T> R<T> fail(T data, String msg) {
        return restReturn(ReturnCode.FAILURE.getCode(),data,  msg);
    }
}
