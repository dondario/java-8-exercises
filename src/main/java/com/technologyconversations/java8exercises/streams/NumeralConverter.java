/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumeralConverter {
    private final Map<Character, Integer> numeralMap;
    private final Numerals numerals;

    public NumeralConverter(Numerals numerals) {
        this.numerals = numerals;
        numeralMap = this.numerals.getNumeralValuesMapWithCharAsKey();
    }

    public Integer convertToInt(String romanNumerals) {
        Integer total = 0;
        List<Character> charList = romanNumerals.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

        for (int currentIndex = 0; currentIndex < charList.size(); currentIndex++) {
            Integer currentNumeralValue = numerals.getNumeralValue(charList.get(currentIndex));


            if(currentIndex < charList.size() - 1) {
                // lookahead to see if Numeral is greater
                Integer nextNumeralValue = numerals.getNumeralValue(charList.get(currentIndex + 1));
                if(nextNumeralValue > currentNumeralValue) {
                    total = total - currentNumeralValue;
                } else {
                    total = total + currentNumeralValue;
                }

            } else {
                total = total + currentNumeralValue;
            }


        }


        return total;
    }

}
