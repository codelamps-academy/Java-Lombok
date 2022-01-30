package com.codelamps.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonBuilderTest {

    @Test
    void testPersonBuilder(){

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Game");
        hobbies.add("Programming");
        hobbies.add("Fitness");

        PersonBuilder personBuilder = PersonBuilder.builder()
                .id("001")
                .name("Andre Rizaldi Brillianto")
                .username("arzailants")
                .email("andrerizaldib@gmail.com")
                .password("123456")
                .hobbies(hobbies)
                .build();
    }

    @Test
    void testPersonBuilder2(){
        PersonBuilder personBuilder2 = PersonBuilder.builder()
                .id("002")
                .name("Alice Shinthesis")
                .username("alice")
                .email("alice.aureliax@gmail.com")
                .password("11111111")
                .hobbies(List.of("Pemrogramman", "Hiking"))
                .build();
    }


}
