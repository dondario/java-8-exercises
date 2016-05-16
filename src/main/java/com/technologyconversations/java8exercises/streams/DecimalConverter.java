/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DecimalConverter {
    private final TreeMap<Integer, String> map;

    public DecimalConverter(Numerals numerals) {
        map = new TreeMap<>(numerals.getNumeralsAsSet().stream().collect(Collectors.toMap(x -> x.getValue(), x -> x.getSymbol().toString())));
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
    }

    public String convert(int romanNumerals) {
        String numerals = "";
        Integer total = romanNumerals;

        while(total > 0) {
            Map.Entry<Integer, String> entry = map.floorEntry(total);
            if(entry != null)    {
                numerals = numerals + entry.getValue();
                total = total - entry.getKey();
            }
        }
        
        return numerals;
    }


}
