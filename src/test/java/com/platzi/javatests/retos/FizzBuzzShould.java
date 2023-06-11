package com.platzi.javatests.retos;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {

    @Test
    public void fizz_number_is_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void buzz_number_is_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void fizzBuzz_number_is_divisible_by_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void return_number_is_not_divisible_by_5_or_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.fizzBuzz(2), is("2"));
        assertThat(fizzBuzz.fizzBuzz(16), is("16"));
    }
}