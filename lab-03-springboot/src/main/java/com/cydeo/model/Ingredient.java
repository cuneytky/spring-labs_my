package com.cydeo.model;

import com.cydeo.enums.QuantityType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
/*
Ingredients: Variables
1. name
2. quantity
3. quantityType (enum)Requirements
 */