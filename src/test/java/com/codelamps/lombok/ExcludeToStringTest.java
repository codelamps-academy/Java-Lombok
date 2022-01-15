package com.codelamps.lombok;

import org.junit.jupiter.api.Test;

public class ExcludeToStringTest {

    @Test
    void testExcludeToString(){
        ExcludeToString exclude = new ExcludeToString("001", "Andre Rizaldi Brillianto", "andrerizaldib@gmail.com", "085888064694", "abcdefghi");

        System.out.println(exclude);
    }
}
