package com.dufuna.berlin.bukunmiadeniyi.lekki.service;

import com.dufuna.berlin.bukunmiadeniyi.lekki.model.LekkiProperty;



public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty Lekkiproperty) {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println(this.getClass().getSimpleName() + "." + new Exception().getStackTrace()[0].getMethodName() + " is called");
        LekkiProperty LekkiProperty = new LekkiProperty(1, "Abuja", "Flat" );
        return LekkiProperty;
    }



}
