package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        Stream.concat(firstSet.stream(), secondSet.stream())
                .filter(e -> firstSet.contains(e) && secondSet.contains(e)
                        && !thirdSet.contains(e))
                .forEach(result::add);
        thirdSet.stream()
                .filter(e -> !firstSet.contains(e) && !secondSet.contains(e))
                .forEach(result::add);
        return result;
    }
}
