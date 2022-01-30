package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonNullTest {

    @Test
    void testNonNull(){

        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new NonNull("null", "null");
        });
    }

    @Test
    void testSetterNonNull(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            var member = new NonNull("001", "Andre Rizaldi Brillianto");
            member.setName("null");
        });
    }
}
