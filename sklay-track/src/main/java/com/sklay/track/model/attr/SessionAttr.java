/*
 * Project:  any
 * Module:   any-track
 * File:     SessionAttr.java
 * Modifier: xyang
 * Modified: 2012-11-29 15:25
 *
 * Copyright (c) 2012 Sanyuan Ltd. All Rights Reserved.
 *
 * Copying of this document or code and giving it to others and the
 * use or communication of the contents thereof, are forbidden without
 * expressed authority. Offenders are liable to the payment of damages.
 * All rights reserved in the event of the grant of a invention patent or the
 * registration of a utility model, design or code.
 */
package com.sklay.track.model.attr;

import com.sklay.track.model.dict.Dicts;

/**
 * .
 * <p/>
 *
 * @author <a href="mailto:oxsean@gmail.com">sean yang</a>
 * @version V1.0, 12-11-29
 */
public interface SessionAttr {
    /**
     * 会话对应app版本
     */
    static final String APP_VERSION = Dicts.APP_VERSION;
    /**
     * 会话客户端ip
     */
    static final String IP = "ip";

    /**
     * 行政区域
     */
    static final String REGION = Dicts.REGION;
    /**
     * 省
     */
    static final String PROVINCE = Dicts.PROVINCE;
    /**
     * 城市
     */
    static final String CITY = Dicts.CITY;
}
