package com.codelamps.lombok;

import org.junit.jupiter.api.Test;

public class ToStringTest {

    @Test
    void testToString(){

        ToString string = new ToString("001", "Andre Rizaldi Brillianto", "andrerizaldib@gmail.com","Wijahan");

        System.out.println(string);
    }
}
