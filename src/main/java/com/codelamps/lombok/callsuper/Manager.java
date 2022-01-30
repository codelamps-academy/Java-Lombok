package com.codelamps.lombok.callsuper;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee{

    private Integer totalEmployee;
}
