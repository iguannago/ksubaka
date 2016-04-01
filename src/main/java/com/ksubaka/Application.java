package com.ksubaka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * Created by davicres on 01/04/2016.
 */
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private Context context = new Context();

    private void display(Collection<? extends Item> items) {
        for (Item item : items) {
            log.info(item.toString());
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        Collection<? extends Item> list = app.context.doCall();
        app.display(list);
    }

}
