package com.cydeo.model;

import com.cydeo.enums.RecipeType;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Recipe {

    private UUID recipeId;
    private String name;
    private int duration;
    private String preparation;
    private List<Ingredient> ingredients;
    private RecipeType recipeType;

}
/*
Classess
Recipe: Variables
1. id
2. name
3. duration
4. preparation
5. ingredients (list of object)
6. recipeType (enum)

Ingredients: Variables
1. name
2. quantity
3. quantityType (enum)
 */