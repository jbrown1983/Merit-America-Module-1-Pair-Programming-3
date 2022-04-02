package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    private Map<String, Double> servicesRendered = new HashMap<>();
    Customer danielle = new Customer("Danielle","Ziemba");

    @Test
    public void getBalanceDueTest(){
        servicesRendered.put("nail trims",500.00);
        servicesRendered.put("walking",1000.00);
        servicesRendered.put("petting",250.00);
        servicesRendered.put("bathing", 200.00);

        Assert.assertEquals(1950.00,danielle.getBalanceDue(servicesRendered),0.00);
    }
}
