package com.codelamps.lombok;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer(){
        Customer customer = new Customer();
        customer.setId("001");
        customer.setName("Andre Rizaldi Brillianto");
        System.out.println("Id Customer = " +customer.getId());
        System.out.println("Name Customer = " +customer.getName());
    }
}
