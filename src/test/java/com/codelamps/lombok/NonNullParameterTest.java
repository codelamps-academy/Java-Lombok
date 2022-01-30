package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

public class NonNullParameterTest {

    @Test
    void testNullParameter(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            var data = new NonNullParameter("001", "Andre Rizaldi Brillianto");
            data.sayHello("null");
        });
    }
}
