package com.mahmoudsaad.xarkas.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}

