package com.codelamps.lombok;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@lombok.RequiredArgsConstructor
public class RequiredArgsConstructor {

    private final String id;

    private final String name;

    private String email;
}
