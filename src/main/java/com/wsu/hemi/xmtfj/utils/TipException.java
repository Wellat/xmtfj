package com.wsu.hemi.xmtfj.utils;

/**
 * Created by yexq on 2017/6/8.
 */
public class TipException extends RuntimeException {
    public TipException() {
    }

    public TipException(String message) {
        super(message);
    }

    public TipException(String message, Throwable cause) {
        super(message, cause);
    }

    public TipException(Throwable cause) {
        super(cause);
    }
}
