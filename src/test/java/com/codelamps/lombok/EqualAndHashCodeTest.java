package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualAndHashCodeTest {

    @Test
    void testEqualsAndHashCode(){

        EqualAndHashCodeDepend customer1 = new EqualAndHashCodeDepend("001", "Andre Rizaldi Brillianto", "arzailants", "123456");
        EqualAndHashCodeDepend customer2 = new EqualAndHashCodeDepend("001", "Andre Rizaldi Brillianto", "arzailants", "123456");

        Assertions.assertEquals(customer1, customer2);
        Assertions.assertEquals(customer1.hashCode(), customer2.hashCode());

    }
}
