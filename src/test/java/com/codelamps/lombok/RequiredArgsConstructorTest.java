package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RequiredArgsConstructorTest {

    @Test
    void testRequired(){

        RequiredArgsConstructor required = new RequiredArgsConstructor("001", "BlackSpring");

        Assertions.assertEquals("001", required.getId());
        Assertions.assertEquals("BlackSpring", required.getName());
    }
}
