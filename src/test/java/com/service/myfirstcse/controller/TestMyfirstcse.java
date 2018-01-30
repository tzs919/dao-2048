package com.service.myfirstcse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMyfirstcse {

        MyfirstcseDelegate myfirstcseDelegate = new MyfirstcseDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = myfirstcseDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}