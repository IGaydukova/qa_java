package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnCorrectValue() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        assertEquals("Sound of cat is incorrect", cat.getSound(), expectedSound);
    }

    @Test
    public void catGetFoodReturnCorrectValue() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = cat.getFood();
        assertEquals("Food of cat is incorrect", actualFood, expectedFood);
    }

}