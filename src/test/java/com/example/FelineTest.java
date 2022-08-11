package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
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



    @Spy
    Feline feline;

    @Test
    public void eatMeatReturnCorrectValue() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);

    }

}