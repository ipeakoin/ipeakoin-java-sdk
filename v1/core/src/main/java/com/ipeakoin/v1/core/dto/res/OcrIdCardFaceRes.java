package com.ipeakoin.v1.core.dto.res;

/**
 * OcrIdCardFaceRes
 *
 * @author klover
 * @date 2024/4/12 14:14
 */
public class OcrIdCardFaceRes {
    private String address;
    private String name;
    private String num;
    private String sex;
    private String nationality;
    private String birth;

    @Override
    public String toString() {
        return "OcrIdCardFaceRes{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
