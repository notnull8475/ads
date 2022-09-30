package ru.gb.hw5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.gb.lessons.lesson5.hw.DegreeCalculator.degree;

public class DegreeTest {

    @Test
    void degreeTest(){
        Assertions.assertEquals(1,degree(2,0));
        Assertions.assertEquals(2,degree(2,1));
        Assertions.assertEquals(4,degree(2,2));
        Assertions.assertEquals(8,degree(2,3));
        Assertions.assertEquals(16,degree(2,4));
        Assertions.assertEquals(32,degree(2,5));
        Assertions.assertEquals(64,degree(2,6));
        Assertions.assertEquals(128,degree(2,7));
        Assertions.assertEquals(256,degree(2,8));
        Assertions.assertEquals(512,degree(2,9));
        Assertions.assertEquals(1024,degree(2,10));


        Assertions.assertEquals(1,degree(5,0));
        Assertions.assertEquals(5,degree(5,1));
        Assertions.assertEquals(25,degree(5,2));
        Assertions.assertEquals(125,degree(5,3));
        Assertions.assertEquals(625,degree(5,4));
        Assertions.assertEquals(3125,degree(5,5));
        Assertions.assertEquals(15625,degree(5,6));
        Assertions.assertEquals(78125,degree(5,7));
        Assertions.assertEquals(390625,degree(5,8));
        Assertions.assertEquals(1953125,degree(5,9));
        Assertions.assertEquals(9765625,degree(5,10));

    }
}
