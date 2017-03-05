/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015-2017 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * Origin: libGDX.
 */

package com.almasb.fxgl.core.reflect;

/** Utilities for Array reflection.
 * @author nexsoftware */
public final class ArrayReflection {

    /** Creates a new array with the specified component type and length. */
    public static Object newInstance(Class c, int size) {
        return java.lang.reflect.Array.newInstance(c, size);
    }

    /** Returns the length of the supplied array. */
    public static int getLength(Object array) {
        return java.lang.reflect.Array.getLength(array);
    }

    /** Returns the value of the indexed component in the supplied array. */
    public static Object get(Object array, int index) {
        return java.lang.reflect.Array.get(array, index);
    }

    /** Sets the value of the indexed component in the supplied array to the supplied value. */
    public static void set(Object array, int index, Object value) {
        java.lang.reflect.Array.set(array, index, value);
    }

}
