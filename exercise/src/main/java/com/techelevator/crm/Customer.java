package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    private List<Pet> pets=new ArrayList<>();
    public List<Pet> getPets() { return pets; }
    public void setPets(List<Pet> pet){ this.pets=pet; }

//    One that accepts three String parameters for first name, last name, and phone number.
//    This constructor must set the phone number property, and call the base class constructor for first and last name.
    public Customer(String firstName, String lastName, String phoneNumber){
        super(firstName,lastName);
        this.phoneNumber=phoneNumber;
    }
//    One that accepts two String parameters for first name and last name.
//    This constructor must call the first constructor with an empty string for phone number.
    public Customer(String firstName, String lastName){
        super(firstName,lastName);
        this.phoneNumber="";
    }


    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue=0;
        for(Map.Entry<String,Double> services : servicesRendered.entrySet()){
            balanceDue+=services.getValue();
        }
        return balanceDue;
    }
}
