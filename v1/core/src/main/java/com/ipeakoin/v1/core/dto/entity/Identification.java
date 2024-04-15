package com.ipeakoin.v1.core.dto.entity;

/**
 * Identification
 *
 * @author klover
 * @date 2024/4/12 14:16
 */
public class Identification {
    private String type;
    private String frontAttachmentId;
    private String backAttachmentId;
    private String number;
    private String startDate;
    private String expirationDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrontAttachmentId() {
        return frontAttachmentId;
    }

    public void setFrontAttachmentId(String frontAttachmentId) {
        this.frontAttachmentId = frontAttachmentId;
    }

    public String getBackAttachmentId() {
        return backAttachmentId;
    }

    public void setBackAttachmentId(String backAttachmentId) {
        this.backAttachmentId = backAttachmentId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "type='" + type + '\'' +
                ", frontAttachmentId='" + frontAttachmentId + '\'' +
                ", backAttachmentId='" + backAttachmentId + '\'' +
                ", number='" + number + '\'' +
                ", startDate='" + startDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}
