package com.ksubaka;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public interface Request {
    Collection<? extends Item> call(String title);
}
