package com.ipeakoin.v1.core.dto.res;

/**
 * OcrPassportRes
 *
 * @author klover
 * @date 2024/4/12 14:15
 */
public class OcrPassportRes {
    private String country;
    private String issue;
    private String issueDate;
    private String issuePlace;
    private String issuePlaceRaw;
    private String expiryDate;
    private String birthDate;
    private String birthPlace;
    private String birthPlaceRaw;
    private String line0;
    private String line1;
    private String name;
    private String nameCn;
    private String nameCnRaw;
    private String nation;
    private String passportNo;
    private String personId;
    private String sex;
    private String type;

    @Override
    public String toString() {
        return "OcrPassportRes{" +
                "country='" + country + '\'' +
                ", issue='" + issue + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", issuePlace='" + issuePlace + '\'' +
                ", issuePlaceRaw='" + issuePlaceRaw + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthPlaceRaw='" + birthPlaceRaw + '\'' +
                ", line0='" + line0 + '\'' +
                ", line1='" + line1 + '\'' +
                ", name='" + name + '\'' +
                ", nameCn='" + nameCn + '\'' +
                ", nameCnRaw='" + nameCnRaw + '\'' +
                ", nation='" + nation + '\'' +
                ", passportNo='" + passportNo + '\'' +
                ", personId='" + personId + '\'' +
                ", sex='" + sex + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    public String getIssuePlaceRaw() {
        return issuePlaceRaw;
    }

    public void setIssuePlaceRaw(String issuePlaceRaw) {
        this.issuePlaceRaw = issuePlaceRaw;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlaceRaw() {
        return birthPlaceRaw;
    }

    public void setBirthPlaceRaw(String birthPlaceRaw) {
        this.birthPlaceRaw = birthPlaceRaw;
    }

    public String getLine0() {
        return line0;
    }

    public void setLine0(String line0) {
        this.line0 = line0;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameCnRaw() {
        return nameCnRaw;
    }

    public void setNameCnRaw(String nameCnRaw) {
        this.nameCnRaw = nameCnRaw;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
