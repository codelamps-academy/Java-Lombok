package com.codelamps.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonBuilder {

    private String id;

    private String name;

    private String username;

    private String password;

    private String email;

    private List<String> hobbies;
}
