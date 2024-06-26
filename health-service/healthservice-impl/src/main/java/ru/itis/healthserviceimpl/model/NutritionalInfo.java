package ru.itis.healthserviceimpl.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NutritionalInfo {

    private int calories;

    private int protein;

    private int fat;

    private int carbohydrates;

}
