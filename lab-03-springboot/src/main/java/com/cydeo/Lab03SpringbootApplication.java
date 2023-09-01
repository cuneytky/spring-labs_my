package com.cydeo;

import com.cydeo.config.AuthorConfig;
import com.cydeo.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab03SpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(Lab03SpringbootApplication.class, args);

        RecipeService recipeService = container.getBean(RecipeService.class);
        recipeService.prepareRecipe();

        AuthorConfig authorConfig = container.getBean(AuthorConfig.class);
        System.out.println("authorConfig.getName() = " + authorConfig.getName());
        System.out.println("authorConfig.getSurname() = " + authorConfig.getSurname());
    }

}
/*
Generating data
You will directly call ShareService on recipeService from Main. You need to
create 100 recipe using for loop.
While recipe object creation you will need some data. In this point you are going to use
JavaFaker library. As a result you need to inject the faker class to recipeService.
As you can see on screenshots, every time you call the faker’s methods it will return
different results and also Faker has many options that you can create fake data with
different types

Some of options provided by Faker
Faker Maven Dependency:

<dependency>
<groupId>com.github.javafaker</groupId>
<artifactId>javafaker</artifactId>
<version>1.0.2</version>
</dependency>

Bonus!!
Who is the creator of these fantastic recipes?
After creating good recipes, you would like mention creator of these beautiful recipes right!!
Provide your name, surname, email and social media links. Sure you are welcome to add more details.
How you will do that?
You will get information from properties file. You can use @Value or @ConfigurationProperties
it depends on your choice.
How you will write the information before application stop, Please have a look at @Predestroy annotation

 */