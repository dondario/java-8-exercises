/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    LinkedHashMap<String, Integer> numeralsToValue;

    public Converter() {
        this.numeralsToValue = new LinkedHashMap<>();
        numeralsToValue.put("I", 1);
        numeralsToValue.put("V", 5);
        numeralsToValue.put("X", 10);
        numeralsToValue.put("L", 50);
        numeralsToValue.put("C", 100);
        numeralsToValue.put("D", 500);
        numeralsToValue.put("M", 1000);
    }

    public Integer convertToInt(String romanNumerals) {
        Integer total = 0;
        List<Character> charList = romanNumerals.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        for (int i = 0; i < charList.size(); i++) {
            Integer value = getNumeralValue(charList.get(i).toString());

            if (value > 0) {
                total = total + value;
            }
        }


        return total;
    }

    private Integer getNumeralValue(String romanNumerals) {
        if (numeralsToValue.containsKey(romanNumerals)) {
            return numeralsToValue.get(romanNumerals);
        }

        return -1;
    }
}
