package com.baidu.excelwrapper.constant;

/**
 * Created by zhangheng07 on 2014/8/22.
 */
public enum TransferType {
    BOOLEAN, STRING, INTEGER, FLOAT, DATE, BIGDECIMAL, DOUBLE ,LONG;

    public static TransferType getEnumByString(String type){
        for (TransferType enumtype : TransferType.values()) {
            if(enumtype.toString().equalsIgnoreCase(type)){
                return enumtype;
            }
        }
        return STRING;
    }
}
