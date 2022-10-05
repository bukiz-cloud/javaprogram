package com.dufuna.berlin.bukunmiadeniyi.lekki.model;
import java.util.Date;
import java.util.Objects;


public class LekkiProperty {
    private String propertyAddress;
    private String propertyType;
    private int propertyId;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private Date validFrom;
    private Date validTo;



    public LekkiProperty(int propertyId, String propertyAddress, String propertyType) {
        this.propertyAddress = propertyAddress;
        this.propertyType = propertyType;
        this.propertyId = propertyId;
    }

    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyAddress='" + propertyAddress + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", propertyId=" + propertyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty)) return false;
        LekkiProperty that;
        that = (LekkiProperty) o;
        return getPropertyId() == that.getPropertyId() && that.getNumberOfBathrooms() == that.getNumberOfBathrooms() && that.getNumberOfSittingRooms() == that.getNumberOfSittingRooms() && getNumberOfKitchens() == that.getNumberOfKitchens() && getNumberOfBathrooms() == that.getNumberOfBathrooms() && getNumberOfToilets() == that.getNumberOfToilets() && Objects.equals(getPropertyAddress(), that.getPropertyAddress()) && Objects.equals(getPropertyType(), that.getPropertyType()) && Objects.equals(getPropertyOwner(), that.getPropertyOwner()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getValidFrom(), that.getValidFrom()) && Objects.equals(getValidTo(), that.getValidTo());
    }

    @Override
    public int hashCode() { return Objects.hash(getPropertyId()); }

    public int getPropertyId() { return propertyId; }

    public void setPropertyId(int propertyId) { this.propertyId = propertyId; }

    public String getPropertyAddress() { return propertyAddress; }

    public void setPropertyAddress(String propertyAddress) { this.propertyAddress = propertyAddress; }

    public String getPropertyType() { return propertyType; }

    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }

    public int getNumberOfBedrooms() { return numberOfBedrooms; }

    public void setNumberOfBedrooms(int numberOfBedrooms) { this.numberOfBedrooms = numberOfBedrooms; }

    public int getNumberOfSittingRooms() { return numberOfSittingRooms; }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) { this.numberOfSittingRooms = numberOfSittingRooms; }

    public int getNumberOfKitchens() { return numberOfKitchens; }

    public void setNumberOfKitchens(int numberOfKitchens) { this.numberOfKitchens = numberOfKitchens; }

    public int getNumberOfBathrooms() { return numberOfBathrooms; }

    public void setNumberOfBathrooms(int numberOfBathrooms) { this.numberOfBathrooms = numberOfBathrooms; }

    public int getNumberOfToilets() { return numberOfToilets; }

    public void setNumberOfToilets(int numberOfToilets) { this.numberOfToilets = numberOfToilets; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Date getValidFrom() { return validFrom; }

    public void setValidFrom(Date validFrom) { this.validFrom = validFrom; }

    public String getPropertyOwner() { return propertyOwner; }

    public void setPropertyOwner(String propertyOwner) { this.propertyOwner = propertyOwner; }

    public Date getValidTo() { return validTo; }

    public void setValidTo(Date validTo) { this.validTo = validTo; }
}