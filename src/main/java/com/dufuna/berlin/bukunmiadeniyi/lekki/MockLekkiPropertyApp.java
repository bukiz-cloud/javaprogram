package com.dufuna.berlin.bukunmiadeniyi.lekki;

import com.dufuna.berlin.bukunmiadeniyi.lekki.model.LekkiProperty;
import com.dufuna.berlin.bukunmiadeniyi.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.bukunmiadeniyi.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
            public static void main(String[] args) {
                LekkiProperty property1 = new LekkiProperty(1, "Abuja", "Flat");
                System.out.println("Property created successfully");

                MockLekkiPropertyService myProperty = new MockLekkiPropertyService();
                myProperty.saveProperty(property1);
                myProperty.getProperty();
            }

}
