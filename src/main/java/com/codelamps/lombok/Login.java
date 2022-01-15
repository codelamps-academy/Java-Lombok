package com.codelamps.lombok;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "create")
@NoArgsConstructor(staticName = "empty")
@Getter
public class Login {

    @Setter(AccessLevel.PROTECTED)
    private String id;

    @Setter(AccessLevel.PROTECTED)
    private String name;
}
