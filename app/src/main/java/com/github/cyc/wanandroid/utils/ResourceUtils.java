package com.github.cyc.wanandroid.utils;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;

import com.github.cyc.wanandroid.app.WanApplication;

/**
 * 资源工具类
 */
public final class ResourceUtils {

    private ResourceUtils() {

    }

    /**
     * 获取字符串资源
     * @param resId 字符串资源ID
     * @return 字符串
     */
    public static String getString(@StringRes int resId) {
        return WanApplication.getInstance().getString(resId);
    }

    /**
     * 获取颜色资源
     * @param resId 颜色资源ID
     * @return 颜色
     */
    public static int getColor(@ColorRes int resId) {
        return ContextCompat.getColor(WanApplication.getInstance(), resId);
    }
}
