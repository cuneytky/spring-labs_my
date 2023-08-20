package com.cydeo.service;

public interface RecipeService {

    boolean prepareRecipe();
}
/*
Interface responsibilities:
RecipeService needs to have 1 implementation, you need to inject recipeRepository
And shareService inside it. There will be 1 method called ShareService. Inside the
ShareService you need to create Recipe objects. You need to initialize list of
ingredients and using JavaFaker (it is provided more information in next slides)
After creation, you need to call recipeRepository’s save method after saving you will
call shareService’s share method. If everything works properly ShareService method
should return true

RecipeService: methods
1. ShareService

RecipeRepository: methods
1. saveRecipe

ShareService:
1. share
 */
