package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {
    protected Alex lionAlex;
    @Before
    public void setUp() throws Exception{
        Feline feline = new Feline();
        lionAlex = new Alex(feline);
    }

    @Test
    public void getPlaceOfLivingReturnCorrectValue() throws Exception{

        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("The Place of Living is Incorrect", actualPlaceOfLiving, expectedPlaceOfLiving);
    }

    @Test
    public void getFriendsReturnCorrectValue() throws Exception{
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");;
        List<String> actualFriends = lionAlex.getFriends();
        Assert.assertEquals("The friends are Incorrect", actualFriends, expectedFriends);
    }

    @Test
    public void getKittensReturnCorrectValue() throws Exception{
        int excpectedKittens = 0;
        int actualKittens = lionAlex.getKittens();
        assertEquals("The quantity of kittens is Incorrect", excpectedKittens, actualKittens);
    }
}