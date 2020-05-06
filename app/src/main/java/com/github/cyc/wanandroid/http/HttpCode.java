package com.github.cyc.wanandroid.http;

/**
 * HTTP码
 */
public final class HttpCode {

    private HttpCode() {

    }

    /**
     * 成功
     */
    public static final int SUCCESS = 0;

    /**
     * 未知错误
     */
    public static final int ERROR_UNKNOWN = 1000;

    /**
     * HTTP错误
     */
    public static final int ERROR_HTTP = 1001;

    /**
     * 网络错误
     */
    public static final int ERROR_NETWORK = 1002;

    /**
     * 解析错误
     */
    public static final int ERROR_PARSE = 1003;

    /**
     * SSL错误
     */
    public static final int ERROR_SSL = 1004;

    /**
     * 登录失效，需要重新登录
     */
    public static final int ERROR_LOGIN_INVALID = -1001;

}
