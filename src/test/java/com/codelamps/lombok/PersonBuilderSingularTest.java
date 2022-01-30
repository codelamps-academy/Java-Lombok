package com.codelamps.lombok;

import org.junit.jupiter.api.Test;

public class PersonBuilderSingularTest {

    @Test
    void testPersonBuilderSingular1(){
        PersonBuilderSingular builderSingular = PersonBuilderSingular.builder()
                .id("001")
                .name("Andre Rizaldi Brillianto")
                .username("arzailants")
                .email("andrerizaldib@gmail.com")
                .password("144244")
                .hobby("Swimming")
                .hobby("Programming") // KETIKA KITA INGIN MENGHAPUS HOBBY, TINGGAL GUNAKAN clearhobbies
                .build();
    }
}
