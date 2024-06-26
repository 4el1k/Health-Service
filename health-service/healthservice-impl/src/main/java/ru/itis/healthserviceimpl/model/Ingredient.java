package ru.itis.healthserviceimpl.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {

    private String name;

    private float amount;

    private String unit;
}
