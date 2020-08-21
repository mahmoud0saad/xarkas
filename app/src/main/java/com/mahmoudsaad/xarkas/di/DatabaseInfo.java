package com.mahmoudsaad.xarkas.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created on : Feb 11, 2019
 * Author     : mahmoud saad
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseInfo {
}