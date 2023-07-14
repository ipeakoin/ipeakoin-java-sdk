package com.ipeakoin.dto.res.v1;

/**
 * @author klover
 * @description OcrIdCardBackRes
 * @date 2023/7/13 20:13
 */
public class OcrIdCardBackRes {
    private String endDate;
    private String startDate;
    private String issue;

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "OcrIdCardBackRes{" +
                "endDate='" + endDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", issue='" + issue + '\'' +
                '}';
    }
}
