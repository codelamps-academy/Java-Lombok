package com.codelamps.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class PersonBuilderSingular {

    private String id;

    private String name;

    private String username;

    private String password;

    private String email;

    @Singular
    private List<String> hobbies;
}
