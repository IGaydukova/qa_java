package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {


    @Test
    public void getPlaceOfLivingReturnCorrectValue() throws Exception{
        Feline feline = new Feline();
        Alex lionAlex = new Alex(feline);
        String expectedPlaceOfLiving = "Нью-Йоркский зоопарк";
        String actualPlaceOfLiving = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("The Place of Living is Incorrect", actualPlaceOfLiving, expectedPlaceOfLiving);
    }

    @Test
    public void getFriendsReturnCorrectValue() throws Exception{
        Feline feline = new Feline();
        Alex lionAlex = new Alex(feline);
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");;
        List<String> actualFriends = lionAlex.getFriends();
        Assert.assertEquals("The friends are Incorrect", actualFriends, expectedFriends);
    }

    @Test
    public void getKittensReturnCorrectValue() throws Exception{
        Feline feline = new Feline();
        Alex lionAlex = new Alex(feline);
        int excpectedKittens = 0;
        int actualKittens = lionAlex.getKittens();
        assertEquals("The quantity of kittens is Incorrect", excpectedKittens, actualKittens);
    }
}