package com.codelamps.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// ANNOTATION LOMBOK ALL ARGS CONSTRUCTOR, DIGUNAKAN UNTUK MEMBUAT CONSTRUCTOR DENGAN MEMASUKKAN FIELD YANG ADA
// URUTAN ALL ARGS CONSTRUCTOR, SESUAI DENGAN URUTAN FIELDNYA
@Getter
@Setter
@NoArgsConstructor
@lombok.AllArgsConstructor
public class AllArgsConstructor {

    private String id;

    private String name;
}
