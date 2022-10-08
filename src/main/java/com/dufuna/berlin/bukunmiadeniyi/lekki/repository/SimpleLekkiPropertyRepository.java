package com.dufuna.berlin.bukunmiadeniyi.lekki.repository;

import com.dufuna.berlin.bukunmiadeniyi.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty lekkiProperty);

    LekkiProperty findById ( int PropertyId);
    List<LekkiProperty> findAll();
    void update( int PropertyId, LekkiProperty lekkiProperty);

}
