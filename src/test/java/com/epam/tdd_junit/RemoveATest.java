package com.epam.tdd_junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Before;
import org.junit.Test;

public class RemoveATest 
{
    RemoveA removeA;

    @Before
    public void initiateClass(){
        this.removeA=new RemoveA();
    }

    @Test
    public void testingOnFirstIndex(){
        String result=removeA.removeA("ABCD");
        assertEquals("BCD",result);
    }
    @Test
    public void testingForTwoIndexes(){
        String result=removeA.removeA("AACD");
        assertEquals("CD",result);
    }
    @Test
    public void testingOnSecondIndex(){
        String result=removeA.removeA("BACD");
        assertEquals("BCD",result);
    }
    @Test
    public void testinForNoA(){
        String result=removeA.removeA("BBAA");
        assertEquals("BBAA",result);
    }
    @Test
    public void testinonNChars(){
        String result=removeA.removeA("AABAA");
        assertEquals("BAA",result);
    }
}