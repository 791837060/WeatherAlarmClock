package com.kaku.weac.zxing.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kaku.weac.util.LogUtil;;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @version 3.5.0
 * @description: The type Json util.
 * Copyright (C), 2020-2021, 武汉思维跳跃科技有限公司
 * @date 2021/12/25 9:45
 */
public class JsonUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final String LOG_TAG = "JsonUtil";
    static {
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * To json str string.
     *
     * @param <T> the type parameter
     * @param o   the o
     * @return the string
     */
    public static <T> String toJsonStr(T o) {
        try {
            return MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            LogUtil.e(LOG_TAG, e.toString());
        }
        return null;
    }

    /**
     * To json object t.
     *
     * @param <T>       the type parameter
     * @param json      the json
     * @param valueType the value type
     * @return the t
     */
    public static <T> T toJsonObject(String json, Class<T> valueType) {
        try {
            return MAPPER.<T>readValue(json, valueType);
        } catch (IOException e) {
            LogUtil.e(LOG_TAG, e.toString());
        }
        return null;
    }


    /**
     * To json list object list.
     *
     * @param <T>       the type parameter
     * @param json      the json
     * @param valueType the value type
     * @return the list
     */
    public static <T> List<T> toJsonListObject(String json, Class<T> valueType) {
        try {
            JavaType getCollectionType = MAPPER.getTypeFactory().constructParametricType(List.class, valueType);
            List<T> list = MAPPER.readValue(json, getCollectionType);
            return list;
        } catch (IOException e) {
            LogUtil.e(LOG_TAG, e.toString());
        }
        return null;
    }

    /**
     * To json object t.
     *
     * @param <T>       the type parameter
     * @param stream    the stream
     * @param valueType the value type
     * @return the t
     */
    public static <T> T toJsonObject(InputStream stream, Class<T> valueType) {
        try {
            T object = MAPPER.<T>readValue(stream, valueType);
            return object;
        } catch (IOException e) {
            LogUtil.e(LOG_TAG, e.toString());
        }
        return null;
    }
}
