package com.codelamps.lombok;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {
        "username",
        "password"
})
public class EqualAndHashCodeExclude {

    @Setter(AccessLevel.PROTECTED)
    private String id;

    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Setter(AccessLevel.PROTECTED)
    private String username;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}
