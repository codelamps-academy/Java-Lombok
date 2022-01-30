package com.codelamps.lombok;

import lombok.Data;
import lombok.NonNull;
import lombok.Value;

@Value
@lombok.With
public class WithClass {

    String id;

    String name;

    String email;
}
