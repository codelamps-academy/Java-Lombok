package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WithTest {

    @Test
    void testWith(){
        WithClass data = new WithClass("001", "Andre Rizaldi Brillianto", "andrerizaldib@gmail.com");
        WithClass data2 = data.withId("002").withName("Alice Aureliax");

        Assertions.assertNotSame(data.getId(), data2.getId());
        Assertions.assertNotSame(data.getName(), data2.getName());
        Assertions.assertSame(data.getEmail(), data2.getEmail());

        System.out.println(data.toString());
        System.out.println(data2.toString());
    }
}
