package com.ipeakoin.v1.core.dto.res;

/**
 * OcrIdCardBackRes
 *
 * @author klover
 * @date 2024/4/12 14:14
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
