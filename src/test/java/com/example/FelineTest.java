package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void getKittensWithoutArgueReturnCorrectValue() {
        Feline feline = new Feline();
        int excpectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals("The quantity of kittens is Incorrect", excpectedKittens, actualKittens);
    }

    @Test
    public void getFamilyReturnCorrectValue() {
        Feline feline = new Feline();
        String excpectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("The Family is Incorrect", excpectedFamily, actualFamily);
    }

    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("The Family is Incorrect", expectedFood, actualFood);
    }


}