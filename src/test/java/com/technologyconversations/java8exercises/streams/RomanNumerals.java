/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RomanNumerals {

    private Converter underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Converter();
    }

    @Test
    public void convertShouldConvertSingleDigitNumerals(){

        assertThat(underTest.convertToInt("I"), equalTo(1));
        assertThat(underTest.convertToInt("V"), equalTo(5));
        assertThat(underTest.convertToInt("X"), equalTo(10));
        assertThat(underTest.convertToInt("L"), equalTo(50));
        assertThat(underTest.convertToInt("C"), equalTo(100));
        assertThat(underTest.convertToInt("D"), equalTo(500));
        assertThat(underTest.convertToInt("M"), equalTo(1000));
    }

    @Test
    public void convertShouldThrowNegativeNumberIfValueCantBeCalculated(){
        assertThat(underTest.convertToInt("A"), equalTo(-1));
    }

    @Test
    public void shouldAddValuesForSameNumbers(){
        assertThat(underTest.convertToInt("III"), equalTo(3));
        assertThat(underTest.convertToInt("CCC"), equalTo(300));
        assertThat(underTest.convertToInt("MCC"), equalTo(1200));
    }

    @Test
    public void ifASmallerNumberComesBeforeALargerNumberItShouldBeAdded(){
     Assert.assertThat(underTest.convertToInt("IV"), CoreMatchers.is(IsEqual.equalTo(4)));
     Assert.assertThat(underTest.convertToInt("IX"), CoreMatchers.is(IsEqual.equalTo(9)));
     Assert.assertThat(underTest.convertToInt("XC"), CoreMatchers.is(IsEqual.equalTo(90)));
    }


}
