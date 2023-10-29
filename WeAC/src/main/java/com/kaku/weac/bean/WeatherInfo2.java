/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com | 3772304@qq.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.kaku.weac.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息
 *
 * @author 咖枯
 * @version 1.0 2015/09/18
 */
public class WeatherInfo2 implements Serializable {
    private static final long serialVersionUID = 479963920700063838L;
    /**
     * 城市
     */
    private String mCity;

    private String mUpdateTime;

    /**
     * 温度
     */
    private String mTemperature;

    /***
     * 湿度
     */
    private String mHumidity;

    /**
     * 风力
     */
    private String mWindPower;

    /**
     * 风向
     */
    private String mWindDirection;

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getHumidity() {
        return mHumidity;
    }

    public void setHumidity(String humidity) {
        mHumidity = humidity;
    }

    public String getTemperature() {
        return mTemperature;
    }

    public void setTemperature(String temperature) {
        mTemperature = temperature;
    }

    public String getWindDirection() {
        return mWindDirection;
    }

    public void setWindDirection(String windDirection) {
        mWindDirection = windDirection;
    }

    public String getWindPower() {
        return mWindPower;
    }

    public void setWindPower(String windPower) {
        mWindPower = windPower;
    }

    public String getUpdateTime() {
        return mUpdateTime;
    }

    public void setUpdateTime(String updateTime) {
        mUpdateTime = updateTime;
    }
}