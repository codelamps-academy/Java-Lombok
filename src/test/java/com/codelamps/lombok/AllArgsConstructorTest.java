package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AllArgsConstructorTest {

    @Test
    void testAllArgsConstructor(){
        AllArgsConstructor constructor = new AllArgsConstructor("001", "Andre Rizaldi Brillianto");

        System.out.println("Id = " +constructor.getId());
        System.out.println("Name = " +constructor.getName());

        Assertions.assertEquals("001", constructor.getId());
        Assertions.assertEquals("Andre Rizaldi Brillianto", constructor.getName());
    }
}
