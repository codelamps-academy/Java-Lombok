package com.codelamps.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
public class AccessLevelGetterSetter {

    @Setter(value = AccessLevel.PROTECTED)
    private String id;

    @Setter(value = AccessLevel.PROTECTED)
    private String name;
}
