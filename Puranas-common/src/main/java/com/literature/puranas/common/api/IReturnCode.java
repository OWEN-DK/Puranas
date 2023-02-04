package com.literature.puranas.common.api;

import java.io.Serializable;

public interface IReturnCode extends Serializable {
    String getMessage();
    int getCode();
}
