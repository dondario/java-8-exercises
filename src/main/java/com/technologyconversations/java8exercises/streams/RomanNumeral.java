/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

public class RomanNumeral implements Comparable<RomanNumeral> {
    Character symbol;
    Integer value;

    public RomanNumeral(Character symbol, Integer decimalValue) {
        this.symbol = symbol;
        this.value = decimalValue;
    }

    public Character getSymbol() {
        return symbol;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public int compareTo(RomanNumeral rhs) {
        return this.value - rhs.getValue();
    }
}
