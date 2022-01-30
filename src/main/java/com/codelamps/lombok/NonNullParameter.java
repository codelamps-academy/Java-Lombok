package com.codelamps.lombok;

import lombok.Data;
import lombok.NonNull;

@Data
public class NonNullParameter {

    @NonNull
    private String id;

    @NonNull
    private String name;

    private String email;

    public String sayHello(@NonNull String name){
        return "Hello " +name+ " My Name is " +this.name;
    }
}
