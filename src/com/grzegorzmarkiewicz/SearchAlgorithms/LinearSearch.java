package com.grzegorzmarkiewicz.SearchAlgorithms;

import com.grzegorzmarkiewicz.SearchAlgorithms.SearchAlgorithm;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, Integer[] input) {
        for(int i = 0; i < input.length-1; i++){
            if(value == input[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }
}
