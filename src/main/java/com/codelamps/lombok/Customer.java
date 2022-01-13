package com.codelamps.lombok;

import lombok.Getter;
import lombok.Setter;

// KETIKA KITA MENAMBAHKAN ANNOTATION LOMBOK DI KELAS, MAKA SEMUA FIELD, AKAN MEMILIKI
// NAMUN KETIKA KITA MENAMBAHKAN ANNOTATION DI FIELD, MAKA HANYA FIELD YANG DIBERI ANNOTATION YANG BERDAMPAK
@Getter
@Setter
public class Customer {

    private String id;

    private String name;
}
