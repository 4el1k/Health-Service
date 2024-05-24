package ru.itis.healthserviceimpl.controller;

import org.bson.types.ObjectId;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.itis.healthserviceimpl.service.RecipeService;

@Controller
public class RecipeViewController {
    private final RecipeService service;

    public RecipeViewController(RecipeService service) {
        this.service = service;
    }

    @GetMapping("/recipes")
    public String listRecipes(Model model) {
        model.addAttribute("recipes", service.findAll(0, 10));
        return "recipes";
    }

    @GetMapping("/recipes/{id}")
    public String showRecipeDetails(@PathVariable ObjectId id, Model model) {
        model.addAttribute("recipe", service.findById(id));
        return "recipe_detail";
    }
}
