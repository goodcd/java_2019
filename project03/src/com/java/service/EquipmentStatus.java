/*
* 设备使用状态
* 自定义枚举类，不使用JDK自带的 enum
* 设备状态有：
*   FREE 空闲，可以被领取
*   USING 使用中，已经别领取
*   SCRAP 已报废，设备做报废处理了
*
* */

package com.java.service;

import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class EquipmentStatus {
    // 类常量
    public static final EquipmentStatus FREE = new EquipmentStatus("FREE");
    public static final EquipmentStatus USING = new EquipmentStatus("USING");
    public static final EquipmentStatus SCRAP = new EquipmentStatus("SCRAP");

    // 类变量
    private static EquipmentStatus[] installs = new EquipmentStatus[]{FREE, USING, SCRAP};

    // 实例变量
    private final String NAME;

    // 构造器
    private EquipmentStatus(String name) {
        NAME = name;
    }

    // 方法
    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return getName();
    }

    public static EquipmentStatus[] values() {
        // return all instance of this class
        return installs;
    }
}