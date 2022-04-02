package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetsTestClass {
    Pet hankThePet = new Pet("Hank", "Dog");
    List<String> theVaccines= new ArrayList<>();

    @Test
    public void listVaccinationsHappyPathTest(){
        theVaccines.add("Rabies");
        theVaccines.add("Distemper");
        theVaccines.add("Parvo");
        hankThePet.setVaccinations(theVaccines);
        Assert.assertEquals("Rabies, Distemper, Parvo",hankThePet.listVaccinations());
    }
}
