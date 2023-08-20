package com.cydeo.repository;

import com.cydeo.model.Recipe;

public interface RecipeRepository {

    boolean save(Recipe recipe);
}
/*
Interface responsibilities:
RecipeRepository needs to have 1 implementation, there will be 1 method save
that it will take Recipe as an input parameter. You need to have a list
Recipe objects so you can save prepared Recipes after adding to list this method
should return true.

RecipeService: methods
1. ShareService
RecipeRepository: methods
1. saveRecipe
ShareService:
1. share

 */