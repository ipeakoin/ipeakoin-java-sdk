package com.ipeakoin.v1.core.dto.entity;

/**
 * Name
 *
 * @author klover
 * @date 2024/4/12 14:16
 */
public class Name {
    private String firstName;
    private String firstNameEn;
    private String firstNamePinYin;
    private String lastName;
    private String lastNameEn;
    private String lastNamePinYin;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public String getFirstNamePinYin() {
        return firstNamePinYin;
    }

    public void setFirstNamePinYin(String firstNamePinYin) {
        this.firstNamePinYin = firstNamePinYin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
    }

    public String getLastNamePinYin() {
        return lastNamePinYin;
    }

    public void setLastNamePinYin(String lastNamePinYin) {
        this.lastNamePinYin = lastNamePinYin;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", firstNameEn='" + firstNameEn + '\'' +
                ", firstNamePinYin='" + firstNamePinYin + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastNameEn='" + lastNameEn + '\'' +
                ", lastNamePinYin='" + lastNamePinYin + '\'' +
                '}';
    }
}
