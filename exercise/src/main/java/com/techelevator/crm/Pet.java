package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    //attributes with their getters and setters under them
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    private String species;
    public String getSpecies(){ return getSpecies(); }
    public void setSpecies(String species){ this.species=species; }

    private List<String> vaccinations = new ArrayList<>();
    public List<String> getVaccinations(){
        return vaccinations;
    }
    public void setVaccinations(List<String> vaccinations){
        this.vaccinations.addAll(vaccinations);
    } //adds list parameter all at once

    //constructor
    public Pet(String name, String species){
        this.name=name;
        this.species=species;
    }

    public String listVaccinations(){
        String delimiter = ", ";
        String vaccineList = String.join(delimiter, vaccinations); //from array to comma string
        return vaccineList;
    }
}
