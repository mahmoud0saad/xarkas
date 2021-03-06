package com.mahmoudsaad.xarkas.data.utils;

import java.util.Date;

import androidx.room.TypeConverter;


/**
 * Created on : Jan 29, 2019
 * Author     : mahmoud saad
 */
public class DateConverter {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}