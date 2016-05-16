/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Numerals {
    Set<RomanNumeral> numerals;
    private Map<Character, Integer> numeravsToDecimalMap;

    public Numerals() {
        numerals = new HashSet<>();
        numerals.add(new RomanNumeral('I', 1));
        numerals.add(new RomanNumeral('V', 5));
        numerals.add(new RomanNumeral('X', 10));
        numerals.add(new RomanNumeral('L', 50));
        numerals.add(new RomanNumeral('C', 100));
        numerals.add(new RomanNumeral('D', 500));
        numerals.add(new RomanNumeral('M', 1000));
    }

    public Set<RomanNumeral> getNumeralsAsSet() {
        return numerals;
    }

    public Map<Character, Integer> getNumeralValuesMapWithCharAsKey() {
        return  numeravsToDecimalMap;
    }



    public Integer getNumeralValue(Character val) {
        if(numeravsToDecimalMap.containsKey(val)) {
            return  numeravsToDecimalMap.get(val);
        }

        return 0;
    }



}
