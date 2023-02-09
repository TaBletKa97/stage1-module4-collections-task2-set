package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : sourceList) {
            set.add(i);
            int copy = i;
            if (copy % 2 == 0) {
                while (copy % 2 == 0) {
                    copy /= 2;
                    set.add(copy);
                }
            } else {
                set.add(2 * copy);
            }

        }
        return set;
    }
}
