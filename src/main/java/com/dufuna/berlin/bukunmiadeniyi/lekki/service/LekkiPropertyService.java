package com.dufuna.berlin.bukunmiadeniyi.lekki.service;

import com.dufuna.berlin.bukunmiadeniyi.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    public void saveProperty (LekkiProperty lekkiProperty);
    public LekkiProperty getProperty(int propertyId);
    List<LekkiProperty> getProperties();

}
