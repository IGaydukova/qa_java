package com.example.WithParametrs;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private int valueKittens;
    private int excpectedKittens;

    public FelineTest(int valueKittens, int excpectedKittens) {
        this.valueKittens = valueKittens;
        this.excpectedKittens = excpectedKittens;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {2, 2},
                {4, 4}
        };
    }

    @Test
    public void getKittensWithArgueReturnCorrectValue() {
        Feline feline = new Feline();
        //int excpectedKittens = 2;
        int actualKittens = feline.getKittens(valueKittens);
        assertEquals("The quantity of kittens is Incorrect", excpectedKittens, actualKittens);


    }

}