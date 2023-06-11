package com.platzi.javatests.retos;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsShould {

    @Test
    public void return_roman_numeral_by_arabic_insert() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertThat(romanNumerals.arabicToRoman(1), is("I"));
        assertThat(romanNumerals.arabicToRoman(2), is("II"));
        assertThat(romanNumerals.arabicToRoman(3), is("III"));
        assertThat(romanNumerals.arabicToRoman(5), is("V"));
        assertThat(romanNumerals.arabicToRoman(6), is("VI"));
        assertThat(romanNumerals.arabicToRoman(7), is("VII"));
        assertThat(romanNumerals.arabicToRoman(10), is("X"));
        assertThat(romanNumerals.arabicToRoman(11), is("XI"));
        assertThat(romanNumerals.arabicToRoman(15), is("XV"));
        assertThat(romanNumerals.arabicToRoman(16), is("XVI"));
        assertThat(romanNumerals.arabicToRoman(50), is("L"));
        assertThat(romanNumerals.arabicToRoman(51), is("LI"));
        assertThat(romanNumerals.arabicToRoman(55), is("LV"));
        assertThat(romanNumerals.arabicToRoman(56), is("LVI"));
        assertThat(romanNumerals.arabicToRoman(60), is("LX"));
        assertThat(romanNumerals.arabicToRoman(70), is("LXX"));
        assertThat(romanNumerals.arabicToRoman(80), is("LXXX"));
        assertThat(romanNumerals.arabicToRoman(81), is("LXXXI"));
        assertThat(romanNumerals.arabicToRoman(85), is("LXXXV"));
        assertThat(romanNumerals.arabicToRoman(86), is("LXXXVI"));
        assertThat(romanNumerals.arabicToRoman(126), is("CXXVI"));
        assertThat(romanNumerals.arabicToRoman(2507), is("MMDVII"));
    }
}