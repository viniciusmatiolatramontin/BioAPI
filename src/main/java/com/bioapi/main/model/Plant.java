package com.bioapi.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Plant {
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

    @NotNull(message = "Height cannot be null")
    private Double averageHeightInMeters;

    public Plant() {

    }

    public Plant(String scientificName, String species, String gender, String family, Double averageHeightInMeters) {
        this.setScientificName(scientificName);
        this.setSpecies(species);
        this.setGender(gender);
        this.setFamily(family);
        this.setAverageHeightInMeters(averageHeightInMeters);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getAverageHeightInMeters() {
        return averageHeightInMeters;
    }

    public void setAverageHeightInMeters(Double averageHeightInMeters) {
        if(averageHeightInMeters < 0){
            throw new IllegalArgumentException("Height must be a number greater than 0");
        }

        this.averageHeightInMeters = averageHeightInMeters;
    }

}
