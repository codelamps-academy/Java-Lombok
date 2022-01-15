package com.codelamps.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void testLogin(){
        Login login = Login.create("001", "Arzailants");

        Assertions.assertEquals("001", login.getId());
        Assertions.assertEquals("Arzailants", login.getName());

        Login login1 = Login.empty();

        Assertions.assertNull(login1.getId());
        Assertions.assertNull(login1.getName());
    }
}
