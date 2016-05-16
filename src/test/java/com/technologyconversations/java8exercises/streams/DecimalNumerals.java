/*
 * Copyright Omnifone Limited 2009-2016. All rights reserved.
 * This source code includes confidential proprietary information.
 */
package com.technologyconversations.java8exercises.streams;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DecimalNumerals {

    private DecimalConverter underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new DecimalConverter(new Numerals());
    }

    @Test
    public void convertShouldConvertSingleDigitNumerals(){
        assertThat(underTest.convert(1), equalTo("I"));
    }

    @Test
    public void convertShouldConvertMulipleDigitNumerals(){
        assertThat(underTest.convert(3), equalTo("III"));
        assertThat(underTest.convert(6), equalTo("VI"));
        assertThat(underTest.convert(2016), equalTo("MMXVI"));
    }

    @Test
    public void convertShouldBeAbleToHandleMinusNumbers(){
        assertThat(underTest.convert(4), equalTo("IV"));
        assertThat(underTest.convert(1900), equalTo("MCM"));
    }




}
