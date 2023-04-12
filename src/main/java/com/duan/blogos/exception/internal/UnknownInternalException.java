package com.duan.blogos.exception.internal;

/**
 * Created on 2018/2/2.
 * 未知内部错误
 *
 * @author hitwh2200400513
 */
public class UnknownInternalException extends InternalRuntimeException {

    public static final int code = 21;

    public UnknownInternalException(Throwable cause) {
        super(cause, code);
    }
}
