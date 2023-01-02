package com.bioapi.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Scientific Name cannot be empty")
    private String scientificName;

    @NotEmpty(message = "Species cannot be empty")
    private String species;

    @NotEmpty(message = "Gender cannot be empty")
    private String gender;

    @NotEmpty(message = "Family cannot be empty")
    private String family;

    @NotNull(message = "Weight cannot be null")
    private Double weightInKilograms;

    @NotNull(message = "Length cannot be null")
    private Double lengthInMeters;

    public Animal() {

    }

    public Animal(String scientificName, String species, String gender, String family,
            Double weightInKilograms, Double lengthInMeters) {
        this.setScientificName(scientificName);
        this.setSpecies(species);
        this.setGender(gender);
        this.setFamily(family);
        this.setWeightInKilograms(weightInKilograms);
        this.setLengthInMeters(lengthInMeters);
    }

    public Long getId() {
        return id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
    public Double getWeightInKilograms() {
        return weightInKilograms;
    }

    public void setWeightInKilograms(Double weightInKilograms) {
        if(weightInKilograms < 0){
            throw new IllegalArgumentException("Weight must be a number greater than 0");
        }

        this.weightInKilograms = weightInKilograms;
    }

    public Double getLengthInMeters() {
        return lengthInMeters;
    }

    public void setLengthInMeters(Double lengthInMeters) {
        if(lengthInMeters < 0){
            throw new IllegalArgumentException("Length must be a number greater than 0");
        }

        this.lengthInMeters = lengthInMeters;
    }
    
}
