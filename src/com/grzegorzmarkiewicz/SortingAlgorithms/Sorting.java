package com.grzegorzmarkiewicz.SortingAlgorithms;

import java.util.List;

public class Sorting implements SortingAlgorithm {
    @Override
    public List<Integer> sort(List<Integer> input) {
        return null;
    }

    @Override
    public Integer[] sort(Integer[] input) {
        boolean loop = true;
        int j = 0;
        while (loop) {
            loop = false;
            j++;
            for (int i = 0; i < input.length - j; i++) {
                if (input[i] > input[i + 1]) {
                    Integer temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
                loop = true;
            }
        }
        Integer[] sorted = input;
        return sorted;
    }
}
