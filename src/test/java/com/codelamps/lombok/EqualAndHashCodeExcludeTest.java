package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualAndHashCodeExcludeTest {

    @Test
    void testExcludeHashCode(){

        EqualAndHashCodeExclude exclude1 = new EqualAndHashCodeExclude("001", "Andre Rizaldi Brillianto", "arzailants", "123456");
        EqualAndHashCodeExclude exclude2 = new EqualAndHashCodeExclude("001", "Andre Rizaldi Brillianto", "alice", "abcdefgh");

        Assertions.assertEquals(exclude1, exclude2);
        Assertions.assertEquals(exclude1.hashCode(), exclude2.hashCode());
    }
}
