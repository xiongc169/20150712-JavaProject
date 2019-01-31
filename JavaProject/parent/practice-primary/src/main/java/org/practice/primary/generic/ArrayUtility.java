package org.practice.primary.generic;

import java.util.List;

public class ArrayUtility {

    public static <T> T getMiddle(List<T> list) {
        int middle = (0 + list.size()) / 2;
        T t = list.get(middle);
        return t;
    }
}
