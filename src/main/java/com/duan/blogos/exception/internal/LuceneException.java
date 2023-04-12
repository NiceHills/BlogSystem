package com.duan.blogos.exception.internal;

/**
 * Created on 2018/1/15.
 * lucene 操作时出错
 *
 * @author hitwh2200400513
 */
public class LuceneException extends InternalRuntimeException {

    public static final int code = 1;

    public LuceneException(Throwable e) {
        super(e, code);
    }
}
