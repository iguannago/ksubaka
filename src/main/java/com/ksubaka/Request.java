package com.ksubaka;

/**
 * Created by davicres on 01/04/2016.
 */
public interface Request<T> {
    T call(String title);
}
