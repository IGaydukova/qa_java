package com.example.WithParametrs;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionTest {
    private String sex;
    private boolean expectedSex;

    public LionTest(String sex, boolean expectedSex) {
        this.sex = sex;
        this.expectedSex = expectedSex;
    }


    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    //Проверка метода doesHaveMane(), с параметризацией
    @Test
    public void doesHaveManeReturnCorrectValue() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        boolean actualSex = lion.doesHaveMane();
        assertEquals("The sex of lion is Incorrect", expectedSex, actualSex);
    }


}



