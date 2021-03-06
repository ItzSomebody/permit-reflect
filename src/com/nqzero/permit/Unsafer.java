// copyright 2018 nqzero - offered under the terms of the MIT License

package com.nqzero.permit;

import java.lang.reflect.Field;

public class Unsafer {
    private static Object getField(Class klass,String name) {
        try {
            Field f = klass.getDeclaredField(name);
            f.setAccessible(true);
            return f.get(null);
        }
        catch (Exception e) { return null; }
    }
    public static final sun.misc.Unsafe uu =
            (sun.misc.Unsafe) getField(sun.misc.Unsafe.class,"theUnsafe");
    
}
