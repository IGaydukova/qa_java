package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    //Проверка метода getKittens
    @Test
    public void lionGetKittensReturnCorrectValue() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int excpectedKittens = 1;
        int actualKittens = lion.getKittens();
        //assert
        assertEquals("The quantity of kittens is Incorrect", excpectedKittens, actualKittens);
    }

    @Test
    public void lionGetFoodReturnCorrectValue() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        Assert.assertEquals("The Food of lion is Incorrect", actualFood, expectedFood);
    }

    // Проверка обработки исключения
    @Test(expected = Exception.class)
    public void testConstructorException() throws Exception {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(feline, "Неизвестен");
        } catch (Exception excSex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", excSex.getMessage());
            throw excSex;
        }
    }


}