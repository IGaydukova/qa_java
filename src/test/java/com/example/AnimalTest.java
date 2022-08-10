package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {
    private String animalKind;
    private List<String> expectedFoodList;

    public AnimalTest(String animalKind, List<String> expectedFoodList) {
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }


    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        };
    }

    @Test
    public void animalGetFoodReturnCorrectValue() throws Exception {
        Animal animal = new Animal();
        List<String> actualFood = animal.getFood(animalKind);
        assertEquals("Food is incorrect", actualFood, expectedFoodList);
    }

    @Test
    public void animalGetFamilyReturnCorrectValue() throws Exception {
        Animal animal = new Animal();
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamily = animal.getFamily();
        assertEquals("Food is incorrect", actualFamily, expectedFamily);
    }

    @Test(expected = Exception.class)
    public void testConstructorException() throws Exception {
        Animal animal = new Animal();
        try {
            animal.getFood("Неизвестный вид");
        } catch (Exception excSex) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", excSex.getMessage());
            throw excSex;
        }
    }

}