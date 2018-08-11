package com.grzegorzmarkiewicz.SearchAlgorithms;

import java.util.List;

public interface SearchAlgorithm {
    Integer search(Integer value, Integer[] input);

    Integer search(Integer value, List<Integer> input);
}
