package com.platzi.javatests.retos;

public class FizzBuzz {


    public String fizzBuzz(int i) {
        String fizzbuzz = "";
        if (i % 3 == 0){
            fizzbuzz += "Fizz";
        }
        if (i % 5 == 0){
            fizzbuzz += "Buzz";
        }

        if (fizzbuzz.equals("")){
            fizzbuzz = String.valueOf(i);
        }

        return fizzbuzz;
    }
}
