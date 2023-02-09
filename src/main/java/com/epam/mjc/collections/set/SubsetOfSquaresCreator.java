package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList,
                                              int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        sourceList.forEach(e -> set.add(e * e));
        return set.stream()
                .filter(e -> e >= lowerBound && e <= upperBound)
                .collect(Collectors.toSet());
    }
}
