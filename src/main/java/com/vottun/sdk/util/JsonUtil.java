package com.vottun.sdk.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static String convertObjectToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = "";
        try {
            jsonString = objectMapper.writeValueAsString(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonString;
    }
}

