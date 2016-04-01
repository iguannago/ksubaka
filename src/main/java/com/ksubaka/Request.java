package com.ksubaka;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public interface Request<T> {
    Collection<? extends Item> call(String title);
}
