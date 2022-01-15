package com.codelamps.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString(exclude = {
        "phoneNumber",
        "password"
})
public class ExcludeToString {

    @Setter(AccessLevel.PROTECTED)
    private String id;

    @Setter(AccessLevel.PROTECTED)
    private String nama;

    @Setter(AccessLevel.PROTECTED)
    private String email;

    @Setter(AccessLevel.PROTECTED)
    private String phoneNumber;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}
