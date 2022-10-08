package com.dufuna.berlin.bukunmiadeniyi.lekki.service;

import com.dufuna.berlin.bukunmiadeniyi.lekki.model.LekkiProperty;
import com.dufuna.berlin.bukunmiadeniyi.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.bukunmiadeniyi.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;


public class MockLekkiPropertyService implements LekkiPropertyService {
    SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
    public void saveProperty(LekkiProperty LekkiProperty) {
        propertyRepository.save(LekkiProperty);
    }

    public LekkiProperty getProperty(int propertyId) {
        return propertyRepository.findById(propertyId);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }
    }



