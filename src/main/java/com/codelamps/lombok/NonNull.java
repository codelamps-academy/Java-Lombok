package com.codelamps.lombok;

import lombok.Data;

@Data
public class NonNull {

    @lombok.NonNull
    private String id;

    @lombok.NonNull
    private String name;
}
