package com.codelamps.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = {
        "price"
})
public class ProductData {

    private final String id;

    private final String nameProduct;

    private final Long price;

    private String description;
}
